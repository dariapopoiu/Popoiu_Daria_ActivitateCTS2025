package program;

import clase.PachetCazare;
import clase.PachetTransport;
import clase.PachetTransportCazare;

// Vânzarea unui pachet turistic se realizează de fiecare data după un
//**pattern bine stabilit**:
// Se caută cazare;
// Se caută transport;
// Se rezervă întreg pachetul;
// Se vinde pachetul, prin realizarea plății.
// Să se implementeze modulul care realizează vânzarea de pachete
//turistice.
public class Main {
    public static void main(String[] args) {

        PachetTransport pachetTransport = new PachetTransport(100);
        pachetTransport.vindePachet();

        System.out.println("-----------------------------------------");
        PachetCazare pachetCazare = new PachetCazare(101);
        pachetCazare.vindePachet();

        System.out.println("-----------------------------------------");
        PachetTransportCazare pachetTransportCazare = new PachetTransportCazare(102);
        pachetTransportCazare.vindePachet();
    }
}