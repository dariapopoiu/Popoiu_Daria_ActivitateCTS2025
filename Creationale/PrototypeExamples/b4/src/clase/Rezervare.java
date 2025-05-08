package clase;

public class Rezervare extends AbstractRezervare{

    public Rezervare(String numeClient, int nrPersoane, String data, String masaPreferata) {
        super(numeClient, nrPersoane, data, masaPreferata);
    }

    public Rezervare() {
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare in data de "+ this.data +" pentru "+ this.numeClient);
    }

    @Override
    public AbstractRezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.data = this.data;
        rezervareNoua.masaPreferata = this.masaPreferata;
        rezervareNoua.nrPersoane = this.nrPersoane;

        return rezervareNoua;
    }
}
