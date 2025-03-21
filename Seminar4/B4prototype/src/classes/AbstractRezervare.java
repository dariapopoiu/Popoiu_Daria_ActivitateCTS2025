package classes;

public abstract class AbstractRezervare {

    //clasa prototip
    private String numeClient;
    private int nrPersoane;
    private String data;
    private String ora;

    public AbstractRezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Generic";
        }

        if(nrPersoane > 2) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 0;
        }
        if(data.length() == 8) {
            this.data = data;
        } else {
            this.data = "20.03.2025";
        }
        this.ora = ora;
    }

    public AbstractRezervare(){
        this.numeClient="Anonim";
        this.nrPersoane=0;
        this.data="01.01.99";
        this.ora="00:00";
    }

    public abstract void descriere();

    //metoda de clonare
    public abstract AbstractRezervare copiaza();

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
