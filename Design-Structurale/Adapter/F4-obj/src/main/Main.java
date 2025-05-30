package main;


import clase.AdapterMetrou;
import clase.Autobuz;
import clase.Metrou;

public class Main {
    private static void capseazaBilet(Metrou transport){
        transport.valideazaBilet();
    }

    private static void capseazaAbonament(Metrou transport){
        transport.valideazaAbonament();
    }

    public static void main(String[] args) {
       Metrou metrou = new Metrou("M4");
       Autobuz autobuz = new Autobuz("16");
       Metrou autobuzAdaptat = new AdapterMetrou(autobuz.getLinie(),autobuz);

       capseazaBilet(metrou);
       capseazaBilet(autobuzAdaptat);
    }
}