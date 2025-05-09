package main;

//Agenția de turism dorește să **anunțe **clienții fideli ori de câte ori apar noi
//oferte. Astfel se dorește implementarea unui modul care atunci când se
//realizează o ofertă de preț sau se introduce un nou pachet să se **trimită
//notificări tuturor clienților** abonați la notificările agenției de turism.

import clase.Agentie;
import clase.ClientFidel;

public class Main {
    public static void main(String[] args) {

        Agentie agentie = new Agentie("CTSAgency");
        ClientFidel clientFidel = new ClientFidel("Andreea");
        ClientFidel clientFidel2 = new ClientFidel("Marius");
        ClientFidel clientFidel3 = new ClientFidel("Cristi");

        agentie.adaugaObserver(clientFidel);
        agentie.adaugaObserver(clientFidel2);
        agentie.adaugaObserver(clientFidel3);

        agentie.trimiteOfertaNoua();

        agentie.stergeObserver(clientFidel3);

        agentie.trimiteReducerePret();

    }
}