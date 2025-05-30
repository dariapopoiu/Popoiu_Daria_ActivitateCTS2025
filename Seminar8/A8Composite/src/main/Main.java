package main;

import clase.Departament;
import clase.IStructura;
import clase.Sectie;

public class Main {
    public static void main(String[] args) throws Exception {
        // Departamentele au sectii ;
        // Sectiile sunt noduri frunza;
        // IStructura => structura unui nod

        Sectie sectie1 = new Sectie("Urgente");
        Sectie sectie2 = new Sectie("Medicina Generala");
        Sectie sectie3 = new Sectie("Stomatologie");

        Departament departament1 = new Departament("Departament General");
        Departament departament2 = new Departament(" Departament Secundar ");

        try {
            departament1.adaugaNod(sectie1);
            departament1.adaugaNod(sectie2);

            departament2.adaugaNod(sectie3);

            departament1.afiseazaStructura();
            departament2.afiseazaStructura();

            departament1.stergeNod(sectie1);
            departament1.afiseazaStructura();

            departament2.adaugaNod(sectie1);
            System.out.println("---------------");
            departament2.afiseazaStructura();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}