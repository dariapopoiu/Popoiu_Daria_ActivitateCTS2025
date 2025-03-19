package main;


import interfete.IPredabil;
import module.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studenti= new ArrayList<>();
        studenti.add(new Student("Mihaela",19,1));
        studenti.add(new Student("Matei",23,2));
        studenti.add(new Student("Bianca",21,3));

        Curs curs= new Curs("CTSS",5, (IPredabil) new Profesor("Alin Zamfiroiu",40,10,6000,0.2F),studenti);
        System.out.println("VENITUL PROFESORULUI "+((Persoana)curs.getCadruDidactic()).getName()
                +" LA CURSUL "+ curs.getNumeCurs()+" : " + String.valueOf(((Persoana)curs.getCadruDidactic()).calculeazaVenit())+" RON");

        curs.afisareDetalii();
        curs.sustineExamene("10 iunie 2025");

        ((IPredabil)curs.getCadruDidactic()).preda();

        Asistent asistent = new Asistent("Asistent", 35, 1, 4000);
        curs.setCadruDidactic(asistent);

        curs.sustineExamene("06 iulie 2025");
    }
}