package sample.ws;

import javax.annotation.concurrent.Immutable;
import org.glassfish.grizzly.ssl.SSLContextConfigurator;
import org.glassfish.grizzly.ssl.SSLEngineConfigurator;
import org.glassfish.tyrus.client.ClientManager;
import org.glassfish.tyrus.client.ClientProperties;
import org.glassfish.tyrus.core.Base64Utils;
import org.glassfish.tyrus.spi.UpgradeRequest;
import sample.keystore.AbstractKeystore;

import javax.websocket.*;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

@Immutable
public abstract class AbstractWSEndpoint {

    private Session session = null;

    public AbstractWSEndpoint() {
        try {
            final AbstractKeystore keystore = getKeystore();
            final ClientEndpointConfig cec = ClientEndpointConfig.Builder.create().configurator(new MyClientConfigurator()).build();
            final ClientManager client = ClientManager.createClient();
            final SSLContextConfigurator defaultConfig = new SSLContextConfigurator();

            keystore.generateKeystore();
            defaultConfig.setTrustStoreFile(keystore.getKeystoreFile().toString());
            defaultConfig.setTrustStorePass(keystore.getKeystorePass());
            final SSLEngineConfigurator sslEngineConfigurator = new SSLEngineConfigurator(defaultConfig, true, false, false);
            client.getProperties().put(ClientProperties.SSL_ENGINE_CONFIGURATOR, sslEngineConfigurator);
            client.connectToServer(new MyClientEndpoint(), cec, new URI(getWSUri()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract String getWSUri();

    protected abstract AbstractKeystore getKeystore();

    /**
     * See {@link javax.websocket.RemoteEndpoint.Async#sendText(String)}
     */
    public Future sendAsyncMessage(String message) {
        System.out.println("Sending message: " + message);
        return session.getAsyncRemote().sendText(message);
    }

    public void addMessageHandler(MessageHandler messageHandler) {
        System.out.println("Adding message handler");
        session.addMessageHandler(messageHandler);
    }

    private class MyClientEndpoint extends Endpoint {
        @Override
        public void onOpen(Session session, EndpointConfig config) {
            System.out.println("Opened connection");
            AbstractWSEndpoint.this.session = session;
        }
    }

    private class MyClientConfigurator extends ClientEndpointConfig.Configurator {

        @Override
        public void beforeRequest(Map<String, List<String>> headers) {
            headers.put(UpgradeRequest.AUTHORIZATION, Collections.singletonList(generateAuthorizationHeader()));
        }

        private String generateAuthorizationHeader() {
            String username = "user";
            byte[] password = "pass".getBytes();

            final byte[] prefix = (username + ":").getBytes();
            final byte[] usernameAndPassword = new byte[prefix.length + password.length];

            System.arraycopy(prefix, 0, usernameAndPassword, 0, prefix.length);
            System.arraycopy(password, 0, usernameAndPassword, prefix.length, password.length);
            return "Basic " + Base64Utils.encodeToString(usernameAndPassword, false);
        }
    }

}
