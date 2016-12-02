package sample;

import sample.process.DcrdProcess;

import java.io.IOException;
import java.util.concurrent.Executors;

public class DcrdMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        Executors.newSingleThreadExecutor().execute(new DcrdProcess());
        Thread.sleep(1000);
    }
}
