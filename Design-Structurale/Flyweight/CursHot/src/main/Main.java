package main;

import clase.Camera;
import clase.Detaliu;
import clase.FabricaCamere;
import clase.ICamera;

public class Main {
    public static void main(String[] args) {
        FabricaCamere fabricaCamere = new FabricaCamere();
        Detaliu detaliu1 = new Detaliu("Daria");
        Detaliu detaliu2 = new Detaliu("Ana");
        Detaliu detaliu3 = new Detaliu("Maria");

        fabricaCamere.getCamera(2).descrieCamera(detaliu1);
        Camera camera = (Camera) fabricaCamere.getCamera(2);
        camera.setNrCerseafuri(100);
        fabricaCamere.getCamera(2).descrieCamera(detaliu2);

        fabricaCamere.getCamera(3).descrieCamera(detaliu2);

        fabricaCamere.getCamera(4).descrieCamera(detaliu1);
        fabricaCamere.getCamera(7).descrieCamera(detaliu3);

        System.out.println(fabricaCamere.getNrCamere());
    }
}