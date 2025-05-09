package main;

import clase.PachetTransport;
import clase.PachetTransportBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PachetTransportBuilder builder = new PachetTransportBuilder().setFumator(true);
        PachetTransport pachetTransport = builder.build();

        System.out.println(pachetTransport);
    }
}