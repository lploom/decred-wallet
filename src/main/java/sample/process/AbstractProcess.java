package sample.process;

import javax.annotation.concurrent.Immutable;
import sample.conf.OsUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

@Immutable
public abstract class AbstractProcess implements Runnable {

    protected final java.lang.Process process;

    public AbstractProcess(String... processCommands) {
        try {
            this.process = new ProcessBuilder()
                    .directory(new File(getClass().getResource("/dcrd-binaries").getFile()))
                    .command(processCommands)
                    .start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while (process.isAlive()) {
            String line;
            try {
                line = inputStream.readLine(); // blocks while waiting for new line
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
    }
}
