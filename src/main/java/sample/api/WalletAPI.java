package sample.api;

import javax.annotation.concurrent.Immutable;
import sample.ws.WalletWSEndpoint;

import java.util.concurrent.CompletableFuture;

@Immutable
public final class WalletAPI extends AbstractAPI {

    public WalletAPI() {
        super(new WalletWSEndpoint());
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

    public CompletableFuture<String> getVersion() {
        return sendQuery("version");
    }

}
