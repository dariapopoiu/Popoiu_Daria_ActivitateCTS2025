package main;

import clase.Facade;
import clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(4,true);
        Facade facade = new Facade();
        System.out.println(facade.verificareMasa(masa));

        Masa masa1 = new Masa(3,false);
        System.out.println(facade.verificareMasa(masa1));

        Masa masa2 = new Masa(5,true);
        System.out.println(facade.verificareMasa(masa2));
    }
}