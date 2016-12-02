package sample.keystore;

import sample.conf.OsUtils;

import java.io.File;
import java.nio.file.Path;

public class WalletKeystore extends AbstractKeystore {

    @Override
    public File getKeystoreFile() {
        return OsUtils.getDcrdWalletPath().resolve("keystore").toFile();
    }

    @Override
    public File getCertFile() {
        return OsUtils.getDcrdWalletPath().resolve("rpc.cert").toFile();
    }

    @Override
    public String getKeystorePass() {
        return "changeit";
    }

    @Override
    public String getKeystoreAlias() {
        return "myKey";
    }

}
