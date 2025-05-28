package main;

import clase.BuilderRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        BuilderRezervare builderRezervare = new BuilderRezervare();
        System.out.println("Builderu la baza");
        System.out.println(builderRezervare);

        Rezervare rezervare1 = new BuilderRezervare().setSetAsezareLaGeam(true).setSetDecorareMasa(true).build();
        System.out.println(rezervare1);


    }
}