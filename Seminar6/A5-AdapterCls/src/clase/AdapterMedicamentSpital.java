package clase;

public class AdapterMedicamentSpital extends MedicamentSpital implements IMedicamentFarmacie{

    public AdapterMedicamentSpital(String nume, double pret, boolean esteInStoc) {
        super(nume, pret, esteInStoc);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
