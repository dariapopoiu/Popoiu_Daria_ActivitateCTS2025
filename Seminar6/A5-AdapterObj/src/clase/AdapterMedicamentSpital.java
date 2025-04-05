package clase;

public class AdapterMedicamentSpital extends MedicamentFarmacie{
    MedicamentSpital medicament;

    public AdapterMedicamentSpital(String nume, double pret) {
        super(nume, pret);
    }

    public AdapterMedicamentSpital(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNume(), medicamentSpital.getPret());
        this.medicament = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
