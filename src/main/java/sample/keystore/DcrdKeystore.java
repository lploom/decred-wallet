package sample.keystore;

import sample.conf.OsUtils;

import java.io.File;

public class DcrdKeystore extends AbstractKeystore {

    @Override
    public File getKeystoreFile() {
        return OsUtils.getDcrdPath().resolve("keystore").toFile();
    }

    @Override
    public File getCertFile() {
        return OsUtils.getDcrdPath().resolve("rpc.cert").toFile();
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
