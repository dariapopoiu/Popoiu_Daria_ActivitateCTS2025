package main;

import clase.*;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.print("Pentru client: ");
        pachetTuristic.descriere();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        Masina masina = new Masina("Opel", 1300);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        PachetTuristic pachetMasina = new PachetMasinaInchiriata(masinaInchiriata);
        printeazaRezervare(pachetMasina);

    }
}