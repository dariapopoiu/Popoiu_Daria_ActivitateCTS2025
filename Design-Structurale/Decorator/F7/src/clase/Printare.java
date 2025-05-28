package clase;

public class Printare extends IPrintare {
    private String statie ;
    private double durata;

    public Printare(String statie, double durata) {
        this.statie = statie;
        this.durata = durata;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Bilet cumparat in statia "+this.statie+" ; durata calatorie:"+this.durata+" min.");
    }
}
