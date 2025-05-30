package main;


import clase.PachetTransport;
import clase.Persoana;
import clase.Proxy;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana(60,"Maria");
        PachetTransport pachetTransport = new PachetTransport(persoana);

        pachetTransport.rezervaPachet();

        Proxy proxy = new Proxy(pachetTransport);
        proxy.rezervaPachet();

        Persoana persoana2 = new Persoana(66,"Maria");
        PachetTransport pachetTransport2 = new PachetTransport(persoana2);
        Proxy proxy2 = new Proxy(pachetTransport2);
        proxy2.rezervaPachet();
    }
}