package clases;

public class Van extends AMasina{
    private String culoare;

    public Van(String nrInmatriculare, double nrKm,String culoare) {
        super(nrInmatriculare, nrKm);
        this.culoare = culoare;
    }

    @Override
    public void afiseazaKm() {
        System.out.println("Van are "+ this.nrKm +"km si "+this.culoare );
    }
}
