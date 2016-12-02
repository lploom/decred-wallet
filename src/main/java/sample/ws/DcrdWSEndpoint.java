package sample.ws;

import javax.annotation.concurrent.Immutable;
import sample.keystore.AbstractKeystore;
import sample.keystore.DcrdKeystore;

@Immutable
public final class DcrdWSEndpoint extends AbstractWSEndpoint {

    @Override
    protected String getWSUri() {
        return "wss://127.0.0.1:9109/ws";
    }

    @Override
    protected AbstractKeystore getKeystore() {
        return new DcrdKeystore();
    }
}
