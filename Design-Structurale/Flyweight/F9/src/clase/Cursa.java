package clase;

public class Cursa {
    protected int nrLinie;
    protected String primaStatie;
    protected String ultimaStatie;

    public Cursa(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public void afiseazaDetalii(){
        System.out.println("Autobuzul linia "+this.nrLinie+" merge de la "+this.primaStatie+" pana la "+this.ultimaStatie);
    }
}
