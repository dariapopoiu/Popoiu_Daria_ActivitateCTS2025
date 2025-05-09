package main;

import classes.AbstractRezervare;
import classes.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervare=new Rezervare();
        AbstractRezervare rezervare2=rezervare.copiaza();

        System.out.println(rezervare);
        System.out.println(rezervare2);

        AbstractRezervare rezervare3=new Rezervare("Daria",10,"12.03.25","16:30");
        AbstractRezervare rezervare4=rezervare3.copiaza();

        System.out.println(rezervare4);
        rezervare4.setNumeClient("Daniel");
        System.out.println(rezervare3);
        System.out.println(rezervare4);
    }
}