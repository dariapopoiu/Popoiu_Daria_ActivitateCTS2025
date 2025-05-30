package main;

import clase.Agentie;
import clase.ClientAbonat;
import clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new ClientAbonat("Daria");
        Observer client2 = new ClientAbonat("Ruxi");

        Agentie agentie = new Agentie("CTS Agency");
        agentie.adaugaObserver(client1);
        agentie.adaugaObserver(client2);

        agentie.notificareOfertaNoua();
        agentie.stergeObserver(client1);

        agentie.trimiteNotificare("NOTIFICARE ");
    }
}