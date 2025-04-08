package clases;

public class Service implements IService {
    private String denumire;
    private String adresa;
    private static Service instanta = null;
    private AMasina masina;

    private Service() {
        this.denumire = "ServiceWOW";
        this.adresa = "Strada Brailei nr 34";
        this.masina = null;
    }

    public static Service getInstanta(){
        if(instanta == null){
            instanta = new Service();
        }
        return instanta;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public AMasina getMasina() {
        return masina;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    @Override
    public void arataClient() {
        if( masina != null)
            System.out.println(" Client masina cu nr "+ masina.nrInmatriculare + " este in Service" );
        else
            System.out.println(" Nu s-a gasit nicio masina");
    }

    @Override
    public void acceptaMasina(AMasina masina) {
        if( this.masina == null){
            this.masina = masina;
        }
        else
            System.out.println(" Masina "+ this.masina.toString() + " este deja in service");
    }

    @Override
    public void elibereazaMasina() {
        this.masina = null;
    }
}
