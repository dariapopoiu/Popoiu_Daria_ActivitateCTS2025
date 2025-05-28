package clase;

public class Client {
    private String nume;
    private Strategy modPlata;

    public void plateste(double suma){
        modPlata.realizeazaPlata(this.nume,suma);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Strategy getModPlata() {
        return modPlata;
    }

    public void setModPlata(Strategy modPlata) {
        this.modPlata = modPlata;
    }

    public Client(String nume, Strategy modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Cash();
    }
}
