package main;

import clase.AutobuzLinie;
import clase.FactoryAutobuz;
import clase.Cursa;

public class Main {
    public static void main(String[] args) {
        FactoryAutobuz factoryAutobuz = new FactoryAutobuz();
        factoryAutobuz.getAutobuz(10);
        factoryAutobuz.getAutobuz(2);
        factoryAutobuz.getAutobuz(15);

        AutobuzLinie autobuz = (AutobuzLinie) factoryAutobuz.getAutobuz(10);
        autobuz.descrieAutobuz();

        Cursa identificareAutobuz = new Cursa(16,"Unirii","Romana");
        autobuz.setAnFabricatie(2000);
        autobuz.setModel("Mercedes");
        autobuz.setDetaliiCursa(identificareAutobuz);

        autobuz.descrieAutobuz();


    }
}