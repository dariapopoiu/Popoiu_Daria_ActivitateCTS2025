package clase;

public class PachetInchiriereMasina extends MasinaInchiriata implements PachetTuristic {

    //cel de clase=> deriveaza din obiectul pe care trb sa-l adaptam
    public PachetInchiriereMasina(Masina masina) {
        super(masina);
    }

    @Override
    public void descriePachet() {
        System.out.println("Acest pachet poate inchiria masini");
    }

    @Override
    public void rezerva() {
        super.inchiriazaMasina();
    }
}
