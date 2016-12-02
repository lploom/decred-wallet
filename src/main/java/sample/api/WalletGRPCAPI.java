package sample.api;


import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import sample.keystore.AbstractKeystore;
import sample.keystore.WalletKeystore;

import javax.annotation.concurrent.Immutable;
import javax.net.ssl.SSLException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import static walletrpc.Api.VersionRequest;
import static walletrpc.Api.VersionResponse;
import static walletrpc.VersionServiceGrpc.VersionServiceBlockingStub;
import static walletrpc.VersionServiceGrpc.newBlockingStub;

@Immutable
public class WalletGRPCAPI {

    private final ManagedChannel channel = openChannel();

    public String getVersion() {
        VersionServiceBlockingStub versionStub = newBlockingStub(channel);
        VersionRequest versionRequest = VersionRequest.newBuilder().build();
        VersionResponse versionResponse = versionStub.version(versionRequest);
        return versionResponse.getVersionString();
    }

    private ManagedChannel openChannel() {
        AbstractKeystore walletKeystore = new WalletKeystore();
        KeyStore keyStore = walletKeystore.generateKeystore();
        try {
            Certificate certificate = keyStore.getCertificate(walletKeystore.getKeystoreAlias());
            return NettyChannelBuilder
                    .forAddress("localhost", 9110)
                    .sslContext(GrpcSslContexts.forClient().trustManager((X509Certificate) certificate).build())
                    .build();
        } catch (KeyStoreException e) {
            throw new RuntimeException("Error querying certificate from java keystore", e);
        } catch (SSLException e) {
            throw new RuntimeException("Error opening SSL connection to dcrwallet grpc", e);
        }
    }
}
