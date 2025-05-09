package main;

import clase.IRezervare;
import clase.ProxyNrPersoane;
import clase.ProxyNumeClient;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxyNrPersoane = new ProxyNrPersoane(rezervare);
        IRezervare proxyNumeClient = new ProxyNumeClient(rezervare);

        proxyNrPersoane.realizeazaRezervare("Alina",6);
        proxyNrPersoane.realizeazaRezervare("Radu",3);

        proxyNumeClient.realizeazaRezervare("Matei",8);
        proxyNumeClient.realizeazaRezervare("Bianca",2);
    }
}