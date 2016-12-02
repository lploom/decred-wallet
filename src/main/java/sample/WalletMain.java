package sample;

import sample.process.WalletProcess;

import java.io.IOException;
import java.util.concurrent.Executors;

public class WalletMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        Executors.newSingleThreadExecutor().execute(new WalletProcess());
        Thread.sleep(1000);
    }
}
