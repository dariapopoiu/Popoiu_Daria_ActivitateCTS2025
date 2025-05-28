package main;

import clase.Rezervare;
import clase.StareEfectuata;
import clase.StareNeplatita;
import clase.StarePlatita;

//Agenția de turism dorește implementare a unui modul pentru gestiunea
//rezervărilor realizate pentru pachetele din oferta sa.
// Rezervările pot fi întrun din următoarele **stări: neplatita, platita, efectuata**
// --> aici schimbarea nu se face la run-time!! ( nu clientul alege )
public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(10);

        StareNeplatita stareNeplatita = new StareNeplatita();
        stareNeplatita.doAction(rezervare);

        StarePlatita starePlatita = new StarePlatita();
        starePlatita.doAction(rezervare);
    }
}