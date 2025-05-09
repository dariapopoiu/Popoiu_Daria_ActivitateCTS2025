package main;

//Agenția de Turism dorește implementarea modului de plată al pachetelor
//turistice rezervate. **Modul de plată îl decide clientul în momentul în care
//trebuie să facă plata*** --> la run-time. Plata se poate realiza cu cardul, cash sau prin
//PayPal.
// Să se implementeze modulul de plată

import clase.Client;
import clase.ModPlata;
import clase.PlataCash;
import clase.PlataPayPal;

public class Main {
    public static void main(String[] args) {
        ModPlata plataCash = new PlataCash();
        Client client = new Client("Daria",plataCash);
        client.plateste(600);

        Client client1 = new Client("Ruxi");
        client1.setModPlata(new PlataPayPal());
        client1.plateste(300);
    }
}