package sample.api;

import javax.annotation.concurrent.Immutable;
import org.json.JSONObject;
import sample.ws.AbstractWSEndpoint;

import javax.websocket.MessageHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Immutable
public abstract class AbstractAPI {

    private final AbstractWSEndpoint wsEndpoint;
    private final AtomicLong id = new AtomicLong();
    private final ConcurrentHashMap<Long, CompletableFuture<String>> resultMap = new ConcurrentHashMap<>(); // TODO think about ways to replace this map (i.e pass CompletableFuture as asyncRemoteHandler)

    public AbstractAPI(AbstractWSEndpoint wsEndpoint) {
        this.wsEndpoint = wsEndpoint;
        wsEndpoint.addMessageHandler(new MyMessageHandler());
    }

    protected CompletableFuture<String> sendQuery(String method) {
        Long id = this.id.incrementAndGet();
        JSONObject queryObj = new JSONObject(getQueryMap(id, method));
        CompletableFuture<String> futureResult = new CompletableFuture<>();
        resultMap.put(id, futureResult);
        wsEndpoint.sendAsyncMessage(queryObj.toString());
        return futureResult;
    }

    private Map<String, String> getQueryMap(Long id, String method) {
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("jsonrpc", "1.0");
        queryMap.put("id", id.toString());
        queryMap.put("method", method);
        return queryMap;
    }

    private class MyMessageHandler implements MessageHandler.Whole<String> {
        @Override
        public void onMessage(String message) {
            JSONObject jsonObj = new JSONObject(message);
            Long id = jsonObj.getLong("id");
            // if above lines thow errors then .complete is never called, thus .get (the client) will block forever
            resultMap.get(id).complete(jsonObj.toString());
        }
    }

}
