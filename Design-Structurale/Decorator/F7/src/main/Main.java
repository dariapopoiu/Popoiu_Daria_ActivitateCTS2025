package main;

import clase.Decorator;
import clase.IPrintare;
import clase.Printare;
import clase.PrintareDecorata;

public class Main {
    public static void main(String[] args) {
        IPrintare printare = new Printare("Brailei",90);
        printare.printeazaBilet();

        IPrintare printare2 = new Printare("Unirii",90);
        Decorator printarePersonalizata = new PrintareDecorata(printare2);
        printarePersonalizata.printeazaBiletPersonalizat("La multi ani");

    }
}