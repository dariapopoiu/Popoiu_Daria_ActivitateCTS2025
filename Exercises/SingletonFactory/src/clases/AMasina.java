package clases;

public abstract class AMasina {
    protected String nrInmatriculare;
    protected double nrKm;

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public AMasina(String nrInmatriculare, double nrKm) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrKm = nrKm;
    }

    public abstract void afiseazaKm();
}
