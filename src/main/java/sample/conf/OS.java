package sample.conf;

import java.nio.file.Path;
import java.nio.file.Paths;

public enum OS {

    WINDOWS("AppData/Local"),
    POSIX(""),
    OSX("Library/Application Support");

    private Path path;

    OS(String path) {
        Path home = Paths.get(System.getProperty("user.home"));
        this.path = home.resolve(path);
    }

    public Path getPath() {
        return path;
    }

}
