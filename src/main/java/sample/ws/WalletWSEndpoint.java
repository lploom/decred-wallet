package sample.ws;

import javax.annotation.concurrent.Immutable;
import sample.keystore.AbstractKeystore;
import sample.keystore.WalletKeystore;

@Immutable
public final class WalletWSEndpoint extends AbstractWSEndpoint {

    @Override
    protected String getWSUri() {
        return "wss://127.0.0.1:9110/ws";
    }

    @Override
    protected AbstractKeystore getKeystore() {
        return new WalletKeystore();
    }
}
