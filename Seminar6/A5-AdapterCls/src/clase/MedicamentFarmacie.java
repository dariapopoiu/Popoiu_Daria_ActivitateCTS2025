package clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String nume;
    private double pret;

    public MedicamentFarmacie(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void cumparaMedicament(){
        System.out.println("Se cumpara medicamentul: " + this.nume + " cu pretul "+ this.pret);
    }
}
