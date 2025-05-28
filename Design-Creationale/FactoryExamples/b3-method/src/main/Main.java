package main;

import clase.FelMancare;
import clase.desert.Cheesecake;
import clase.desert.Clatite;
import clase.desert.Desert;
import factory.*;

public class Main {
    public static void main(String[] args) {
        DesertFactory desertFactory = new DesertFactory(150,45,200);
        FelMancare clatite = desertFactory.clone(TipDesert.Clatite,"oua lapte faina",100);
        clatite.preparaManacare();

        FelMancare cheesecake = desertFactory.clone(TipDesert.Cheesecake,"oua mascarpone",400);
        cheesecake.preparaManacare();

        SupaFactory factory = new SupaFactory(100,12,102);
        FelMancare supaCiuperci = factory.clone(TipSupa.Ciuperci,"apa ciuperci",300);
        supaCiuperci.preparaManacare();
    }
}