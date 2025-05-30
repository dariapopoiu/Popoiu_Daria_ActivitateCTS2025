package main;

import clase.Aplicatie;
import clase.Calator;
import clase.Observer;
import clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator();
        Observer calator2 = new Calator();
        Observer calator3 = new Calator();
        Observer calator4 = new Calator();

        Aplicatie aplicatie = new Aplicatie();
        aplicatie.aboneazaCalator(calator1);
        aplicatie.aboneazaCalator(calator2);
        aplicatie.aboneazaCalator(calator3);
        aplicatie.aboneazaCalator(calator4);

        aplicatie.pleacaAutobuz();

        aplicatie.dezaboneazaCalator(calator4);

        System.out.println("-----------------");
        aplicatie.pleacaAutobuz();
    }
}