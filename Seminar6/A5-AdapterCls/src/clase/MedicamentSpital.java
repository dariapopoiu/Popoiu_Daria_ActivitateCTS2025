package clase;

public class MedicamentSpital {

    private String nume;
    private double pret;
    private boolean esteInStoc;

    public MedicamentSpital(String nume, double pret,boolean esteInStoc) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public boolean isEsteInStoc() {
        return esteInStoc;
    }

    public void achizitioneazaMedicament(){
        System.out.println("Se cumpara medicamentul cu pretul: "+ this.pret);
        prezintaReteta();
    }

    public void prezintaReteta(){
        if(this.esteInStoc)
            System.out.println(" Reteta: medicament " + this.nume);
    }
}
