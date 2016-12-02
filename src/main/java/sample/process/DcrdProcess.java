package sample.process;

import javax.annotation.concurrent.Immutable;
import sample.conf.OsUtils;

@Immutable
public class DcrdProcess extends AbstractProcess {

    public DcrdProcess() {
        super(OsUtils.getExeCmd("dcrd"), "-u", "user", "-P", "pass");
    }

}
