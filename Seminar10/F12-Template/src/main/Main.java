package main;

import clase.Linie;
import clase.LinieSpeciala;
import clase.TemplateLinie;

public class Main {
    public static void main(String[] args) {
        TemplateLinie metrou = new Linie();
        metrou.circulaTur();
        System.out.println("****");
        metrou.circulaRetur();

        System.out.println("----------------------------");

        TemplateLinie metrouSpecial = new LinieSpeciala();
        metrouSpecial.circulaRetur();
        System.out.println("****");
        metrouSpecial.circulaTur();
    }
}