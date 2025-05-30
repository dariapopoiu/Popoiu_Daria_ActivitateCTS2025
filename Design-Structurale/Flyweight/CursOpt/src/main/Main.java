package main;

import clase.FabricaPachete;
import clase.IPachetTuristic;
import clase.Optional;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        FabricaPachete fabricaPachete = new FabricaPachete();
        Optional optional1 = new Optional(true,4);
        Optional optional2 = new Optional(true,2);
        Optional optional3 = new Optional(false,10);

        PachetTuristic pachetTuristic = (PachetTuristic) fabricaPachete.getPachet(1);
        PachetTuristic pachetTuristic2 = (PachetTuristic) fabricaPachete.getPachet(2);

        pachetTuristic.descriePachet(optional1);

        pachetTuristic2.descriePachet(optional3);
    }
}