package main;

//A.1. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare
//pacient are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic
//dejun inclus, papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste
//facilitați extra, in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea
//de obiecte de tipul pacient cu opțiuni extra

import builder.PacientBuilderV1;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------prima versiune builder----------------");


        PacientBuilderV1 pacientBuilder = new PacientBuilderV1();
        Pacient pacient = pacientBuilder.setArePatRabatabil(true).setNumeInsotitor("Alina").build();
        System.out.println(pacient.toString());

        Pacient pacient2 = pacientBuilder.setAreHalat(true).setNumeInsotitor("Dragos").build();
        System.out.println(pacient2);

        //!!problema acestei variante e ca se va modifica instanta ; trebuie alt Builder pt a fi distincte
        System.out.println(pacient);



    }
}