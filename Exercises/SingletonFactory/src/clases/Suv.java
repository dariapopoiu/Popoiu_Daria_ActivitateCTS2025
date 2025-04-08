package clases;

public class Suv extends AMasina {
    private String nrUsi;

    public Suv(String nrInmatriculare, double nrKm,String nrUsi) {
        super(nrInmatriculare, nrKm);
        this.nrUsi = nrUsi;
    }

    @Override
    public void afiseazaKm() {
        System.out.println("Suv are "+ this.nrKm +"km si "+this.nrUsi);
    }
}
