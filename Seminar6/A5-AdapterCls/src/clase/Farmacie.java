package clase;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicamnete(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia "+numeFarmacie+" va ofera medicamentul");
        medicamentFarmacie.cumparaMedicament();
    }
}
