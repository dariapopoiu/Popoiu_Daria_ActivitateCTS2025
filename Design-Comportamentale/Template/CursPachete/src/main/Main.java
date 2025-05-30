package main;

import clase.PachetCazare;
import clase.PachetCazareTransport;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare(300);
        pachetCazare.vindePachet();

       PachetTuristic pachetTuristicCazare = new PachetCazareTransport(202);
       pachetTuristicCazare.vindePachet();
    }
}