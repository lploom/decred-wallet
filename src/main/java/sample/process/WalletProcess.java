package sample.process;

import sample.conf.OsUtils;

public class WalletProcess extends AbstractProcess {

    public WalletProcess() {
        super(OsUtils.getExeCmd("dcrwallet"), "-u", "user", "-P", "pass", "--experimentalrpclisten", "127.0.0.1:9110", "--noinitialload");
    }

}
