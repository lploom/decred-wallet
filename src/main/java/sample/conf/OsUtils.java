package sample.conf;

import java.nio.file.Path;

public final class OsUtils {

    private static OS os;

    static {
        String osName = System.getProperty("os.name");
        if (osName.contains("Windows")) {
            os = OS.WINDOWS;
        } else if (osName.contains("Mac")) {
            os = OS.OSX;
        } else {
            os = OS.POSIX;
        }
    }

    private OsUtils() {}

    public static String getExeCmd(String command) {
        if (os == OS.WINDOWS) {
            return command + ".exe";
        }
        return "./" + command;
    }

    public static Path getDcrdPath() {
        return os.getPath().resolve(".dcrd");
    }

    public static Path getDcrdWalletPath() {
        return os.getPath().resolve(".dcrwallet");
    }

    public static OS getOs() {
        return os;
    }

}
