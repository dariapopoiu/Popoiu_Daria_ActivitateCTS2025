package main;

import clase.Pacient;
import clase.PacientAbstract;
import clase.Receptie;
import flyweight.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie = new Receptie();

        receptie.getPacient("Daria","02823274745"," str. soarelui 2");
        receptie.getPacient("Andreea","832737274","str. binelui 1");
        receptie.getPacient("Matei","834202","str. valea doftanei 24");

        Spitalizare spitalizare = new Spitalizare(1,2,5);
        Spitalizare spitalizare2 = new Spitalizare(4,14,9);
        Spitalizare spitalizare3 = new Spitalizare(6,2,10);
        Spitalizare spitalizare4 = new Spitalizare(11,20,1);

        try {
            receptie.getPacient("Daria").afisareInformatii(spitalizare);
            receptie.getPacient("Daria").afisareInformatii(spitalizare2);
            receptie.getPacient("Andreea").afisareInformatii(spitalizare4);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}