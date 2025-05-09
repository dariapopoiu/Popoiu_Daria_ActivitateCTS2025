package main;

import clase.AbstractRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervare = new Rezervare("Daria",10,"05/04/2025","langa geam");
        AbstractRezervare rezervare2 = rezervare.copiaza();

        rezervare2.descriere();

    }
}