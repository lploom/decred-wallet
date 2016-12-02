package sample.keystore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public abstract class AbstractKeystore {

    public KeyStore generateKeystore() {
        KeyStore keyStore;
        try {
            if (!Files.exists(getKeystoreFile().toPath())) {
                keyStore = generateEmptyKeystore();
            } else {
                keyStore = loadKeystore();
            }

            if (!keyStore.containsAlias(getKeystoreAlias())) {
                X509Certificate cert = getCert();
                addCertToKeystore(keyStore, cert);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error generating keystore. ", e);
        }
        return keyStore;
    }

    public abstract File getKeystoreFile();

    public abstract File getCertFile();

    public abstract String getKeystorePass();

    public abstract String getKeystoreAlias();

    private void addCertToKeystore(KeyStore keystore, X509Certificate cert) throws Exception {
        keystore.setCertificateEntry(getKeystoreAlias(), cert);
        keystore.store(new FileOutputStream(getKeystoreFile()), getKeystorePass().toCharArray());
    }

    private X509Certificate getCert() throws Exception {
        InputStream certInputStream = new FileInputStream(getCertFile());
        CertificateFactory factory = CertificateFactory.getInstance("X.509");
        return (X509Certificate) factory.generateCertificate(certInputStream);
    }

    private KeyStore generateEmptyKeystore() throws Exception {
        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        keystore.load(null);
        return keystore;
    }

    private KeyStore loadKeystore() throws Exception {
        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        keystore.load(new FileInputStream(getKeystoreFile()), getKeystorePass().toCharArray());
        return keystore;
    }

}
