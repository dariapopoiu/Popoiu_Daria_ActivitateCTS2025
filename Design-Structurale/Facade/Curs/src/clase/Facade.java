package clase;

public class Facade {

    public void rezervaPachet(String oras,int nrCamera, int nrLoc){
        CompanieAeriana companieAeriana = new CompanieAeriana("CTS AIRLINES");
        Zbor zbor_dus = companieAeriana.rezervaBilet(nrLoc,oras);
        Zbor zbor_intors = companieAeriana.rezervaBilet(nrLoc,oras);

        Hotel hotel = new Hotel(nrCamera,oras);
        System.out.println("S-a creat pachetul cu zborurile :"+zbor_dus.toString()+" , "+zbor_intors);
        hotel.rezervaCamera();

    }
}
