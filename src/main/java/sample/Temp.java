package sample;

import sample.api.WalletGRPCAPI;

public class Temp {

    public static void main(String[] args) throws Exception {

        WalletGRPCAPI gRPC = new WalletGRPCAPI();

        System.out.println(gRPC.getVersion());


    }

}

