package classes;

public class Rezervare extends AbstractRezervare {

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    public Rezervare() {
        super();
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare pentru " + getNumeClient()+" la ora " + getOra());
    }

    @Override
    public AbstractRezervare copiaza() {
        Rezervare rezervareNoua=new Rezervare();
        rezervareNoua.setNumeClient(getNumeClient());
        rezervareNoua.setNrPersoane(getNrPersoane());
        rezervareNoua.setData(getData());
        rezervareNoua.setOra(getOra());
        
        return rezervareNoua;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
