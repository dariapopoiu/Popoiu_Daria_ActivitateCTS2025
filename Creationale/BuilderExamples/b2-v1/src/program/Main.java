package program;

import clase.BuilderRezervare;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuilderRezervare builderRezervare = new BuilderRezervare();
        builderRezervare = builderRezervare.setAsezareLaGeam(true).setDecor(true);
        Rezervare r1 = builderRezervare.build();
        System.out.println(r1);

        Rezervare r2 = builderRezervare.setMuzica(true).build();

        System.out.println(r1);
        System.out.println(r2);
    }
}