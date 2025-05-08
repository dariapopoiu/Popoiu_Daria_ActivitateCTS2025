package clase;

public class PachetInchiriereMasina implements PachetTuristic {
    private MasinaInchiriata masinaInchiriata;

    public PachetInchiriereMasina(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriePachet() {
        System.out.println("Acest pachet poate inchiria masini");
    }

    @Override
    public void rezerva() {
        this.masinaInchiriata.inchiriazaMasina();
    }
}
