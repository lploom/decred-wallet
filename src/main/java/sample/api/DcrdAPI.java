package sample.api;

import javax.annotation.concurrent.Immutable;
import sample.ws.DcrdWSEndpoint;

import java.util.concurrent.CompletableFuture;

@Immutable
public final class DcrdAPI extends AbstractAPI {

    public DcrdAPI() {
        super(new DcrdWSEndpoint()); // open websocket
    }

    public CompletableFuture<String> getDifficulty() {
        return sendQuery("getdifficulty");
    }

    public CompletableFuture<String> getConnectionCount() {
        return sendQuery("getconnectioncount");
    }

    public CompletableFuture<String> getInfo() {
        return sendQuery("getinfo");
    }

}
