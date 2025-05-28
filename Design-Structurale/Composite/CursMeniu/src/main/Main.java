package main;

import clase.Categorie;
import clase.ItemFrunza;
import clase.Optiune;

public class Main {
    public static void main(String[] args) {
        Optiune categorie1 = new Categorie("Cariere");
        Optiune categorie2 = new Categorie("Contacte");
        Optiune categorie3 = new Categorie("Despre noi");

        Optiune item1 = new ItemFrunza("Anunturi");
        Optiune item2 = new ItemFrunza("HR Team");
        Optiune item3 = new ItemFrunza("Program cu publicul");
        Optiune item4 = new ItemFrunza("Adresa");
        Optiune item5 = new ItemFrunza("Blog");

        try {
            categorie1.adaugaOptiune(item1);
            categorie1.adaugaOptiune(item2);

            categorie2.adaugaOptiune(item3);

            categorie3.adaugaOptiune(item4);
            categorie3.adaugaOptiune(item5);

            categorie3.adaugaOptiune(categorie1);
            categorie3.adaugaOptiune(categorie2);

            categorie3.descriere();

            categorie3.stergeOptiune(categorie1);


            System.out.println("===================");
            categorie3.descriere();

            System.out.println("===================");
            categorie3.getOptiune(2).descriere();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}