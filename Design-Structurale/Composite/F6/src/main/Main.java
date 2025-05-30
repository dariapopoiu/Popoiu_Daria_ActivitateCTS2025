package main;

import clase.AbstractAutobuz;
import clase.FrunzaAutobuz;
import clase.GrupaAutobuz;

public class Main {
    public static void main(String[] args) {
        AbstractAutobuz autobuz1 = new FrunzaAutobuz("Mercedes","C14",10);
        AbstractAutobuz autobuz2 = new FrunzaAutobuz("Mercedes","D30",10);
        AbstractAutobuz autobuz3 = new FrunzaAutobuz("Audi","Electric",30);
        AbstractAutobuz autobuz4 = new FrunzaAutobuz("Audi","Hybrid",50);
        AbstractAutobuz autobuz5 = new FrunzaAutobuz("Mercedes","A3",50);

        AbstractAutobuz autobuzeMici = new GrupaAutobuz("Mici");
        AbstractAutobuz autobuzeMedii = new GrupaAutobuz("Medii");
        AbstractAutobuz autobuzeMari = new GrupaAutobuz("Mari");

        AbstractAutobuz autobuzeTotal = new GrupaAutobuz("Flota");

        try {
            autobuzeMici.adaugaAutobuz(autobuz1);
            autobuzeMici.adaugaAutobuz(autobuz2);

            autobuzeMedii.adaugaAutobuz(autobuz3);

            autobuzeMari.adaugaAutobuz(autobuz4);
            autobuzeMari.adaugaAutobuz(autobuz5);

            autobuzeTotal.adaugaAutobuz(autobuzeMici);
            autobuzeTotal.adaugaAutobuz(autobuzeMedii);
            autobuzeTotal.adaugaAutobuz(autobuzeMari);

            autobuzeTotal.vizualizeazaDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}