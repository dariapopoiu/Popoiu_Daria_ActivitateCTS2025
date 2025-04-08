package clases;

public class Sedan extends AMasina{
    private String areAC;

    public Sedan(String nrInmatriculare, double nrKm,String areAC) {
        super(nrInmatriculare, nrKm);
        this.areAC = areAC;
    }

    @Override
    public void afiseazaKm() {
        System.out.println("Sedan are "+ this.nrKm +"km si " + this.areAC);
    }
}
