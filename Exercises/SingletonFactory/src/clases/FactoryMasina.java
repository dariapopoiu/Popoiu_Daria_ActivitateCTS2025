package clases;

public class FactoryMasina implements AbstractFactory{
    protected String nrInmatriculare;
    protected double nrKm;

    public FactoryMasina(String nrInmatriculare, double nrKm) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrKm = nrKm;
    }

    @Override
    public AMasina getMasina(TipMasina tip,String extra) {
        switch (tip){
            case SUV :
                Suv suv = new Suv(nrInmatriculare,nrKm,extra);
                return suv;
            case VAN:
                Van van = new Van(nrInmatriculare,nrKm,extra);
                return van;
            case SEDAN:
                Sedan sedan = new Sedan(nrInmatriculare,nrKm,extra);
                return sedan;
            default:return null;
        }
    }
}
