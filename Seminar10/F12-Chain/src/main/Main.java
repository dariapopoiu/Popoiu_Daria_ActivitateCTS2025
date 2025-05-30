package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler autobuz = new HandlerAutobuz();
        Handler tramvai = new HandlerTramvai();
        Handler troleibuz = new HandlerTroleibuz();
        Handler metrou = new HandlerMetrou();

        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        autobuz.parcurgeDrum(10);
        troleibuz.parcurgeDrum(2);

        tramvai.parcurgeDrum(20);
    }
}