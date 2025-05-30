package main;


import clase.Factura;
import clase.FacturaDecorata;
import clase.IFactura;

public class Main {
    public static void main(String[] args) {
        IFactura factura = new Factura(321,124);
        factura.printeazaFactura();

        Factura factura1 = new Factura(355,79);
        FacturaDecorata facturaSpeciala = new FacturaDecorata(factura1);
        facturaSpeciala.aplicaDiscount(20);
        facturaSpeciala.printeazaFactura();
    }
}