package clase;

public abstract class AbstractRezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String masaPreferata;

    public AbstractRezervare(String numeClient, int nrPersoane, String data, String masaPreferata) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
        this.data = data;
        this.masaPreferata = masaPreferata;
    }

    public AbstractRezervare() {
        this.numeClient = "Necunoscut";
        this.nrPersoane = 0;
        this.data = "01/01/2000";
        this.masaPreferata = "Niciuna";
    }

    public abstract void descriere();
    public abstract AbstractRezervare copiaza();

}
