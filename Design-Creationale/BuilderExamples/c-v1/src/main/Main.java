package main;


import clase.PachetTransport;
import clase.PachetTransportBuilder;

public class Main {
    public static void main(String[] args) {
        PachetTransport pachetTransport = new PachetTransport(true,false,false,false,false);
        PachetTransportBuilder builder = new PachetTransportBuilder(pachetTransport);

        PachetTransport pachetTransport1 = builder.setHasAC(true).build();
        PachetTransport pachetTransport2 = builder.setHasAC(false).build();

        System.out.println(pachetTransport1);
    }
}