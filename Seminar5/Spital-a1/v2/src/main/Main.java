package main;

//A.1. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare
//pacient are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic
//dejun inclus, papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste
//facilitați extra, in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea
//de obiecte de tipul pacient cu opțiuni extra

import builder.PacientBuilderV2;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------a doua versiune builder----------------");

        PacientBuilderV2 pacientBuilderV2 = new PacientBuilderV2();
        Pacient pacient3 = pacientBuilderV2.build();
        pacient3.setAreMicDejun(true);
        pacient3.setNumeInsotitor("Dora");

        System.out.println(pacient3);

        Pacient pacient4 = pacientBuilderV2.build();
        pacient4.setArePapuci(true);
        pacient4.setNumeInsotitor("Ana");

        System.out.println(pacient4);

        System.out.println(pacient3);


    }
}