package clase;

public class Metrou {
    private String nrMetrou;

    public Metrou(String nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    public void valideazaBilet(){
        System.out.println("S-a validat biletul pentru transport:"+this.nrMetrou);
    }
    public void valideazaAbonament(){
        System.out.println("S-a validat abonamentul pentru transport:"+this.nrMetrou);

    }
}
