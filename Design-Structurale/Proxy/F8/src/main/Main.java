package main;

import clase.Autobuz;
import clase.IAutobuz;
import clase.Proxy;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz(10);
        autobuz.opresteStatie();
        System.out.println("-----------");

        Autobuz autobuz2 = new Autobuz(0);
        autobuz2.opresteStatie();
        IAutobuz proxy = new Proxy(autobuz2);
        proxy.opresteStatie();
    }
}