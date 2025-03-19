package main;

import singleton.registry.AutoritatePescuit;
import singleton.registry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit= AutoritatePescuit.getInstanta();

        Autorizatie autor=autoritatePescuit.emiteAutorizatii("Daria");
        System.out.println(autor.toString());
        Autorizatie autor2=autoritatePescuit.emiteAutorizatii("Daria");
        System.out.println(autor.toString());
    }
}