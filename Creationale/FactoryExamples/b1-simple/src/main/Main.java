package main;

import clase.Supa;
import factory.SupaFactory;
import factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        SupaFactory factory = new SupaFactory(100,50);

        Supa supa = factory.clone(TipSupa.Vita,"apa, sare, piper",50);
        supa.preparaSupa();

        Supa supa2 = factory.clone(TipSupa.Legume,"morcovi,ceapa,sare",90);
        supa2.preparaSupa();

        System.out.println(supa.calculeazaPret());
    }
}