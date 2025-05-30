package main;

import clase.Calator;
import clase.CardBancar;
import clase.ModPlata;
import clase.SMS;

public class Main {
    public static void main(String[] args) {
        ModPlata cardBancar = new CardBancar();

        Calator calator = new Calator();
        calator.setModPlata(cardBancar);
        calator.achitaCalatorie(5);

        ModPlata sms = new SMS();
        calator.setModPlata(sms);
        calator.achitaCalatorie(10);


    }
}