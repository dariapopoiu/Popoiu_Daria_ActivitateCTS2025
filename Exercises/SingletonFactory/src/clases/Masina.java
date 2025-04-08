package clases;

public class Masina extends AMasina{
    private String model;
    private int anFabricatie;

    public Masina(String nrInmatriculare, double nrKm,String model,int anFabricatie) {
        super(nrInmatriculare, nrKm);
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public void afiseazaKm() {
        System.out.println(" Masina a parcurs "+ this.nrKm+" km ");
    }
}
