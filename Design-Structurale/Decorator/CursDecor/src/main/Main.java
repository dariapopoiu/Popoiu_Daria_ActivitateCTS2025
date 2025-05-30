package main;

import clase.AbstractOfertaPachet;
import clase.OfertaPachet;
import clase.PachetCazare;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        pachetCazare.descriere();

        AbstractOfertaPachet ofertaPachet = new OfertaPachet(pachetCazare);
        ofertaPachet.anuleazaRezervare();
    }
}