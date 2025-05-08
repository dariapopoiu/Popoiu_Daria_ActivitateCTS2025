package clase;

public class Facade {
    public void rezervaPachet(String plecare, String destinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("CTSAirlines");
        Zbor zborDus = new Zbor(plecare,destinatie,companieAeriana);
        Zbor zborIntors = new Zbor(destinatie,plecare,companieAeriana);
        Hotel hotel = new Hotel("CTSHotel");
        hotel.rezervaCamera(destinatie);
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
    }
}
