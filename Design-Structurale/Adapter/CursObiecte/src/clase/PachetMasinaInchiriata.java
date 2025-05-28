package clase;

public class PachetMasinaInchiriata extends PachetTuristic {
    private MasinaInchiriata masina;

    public PachetMasinaInchiriata(MasinaInchiriata masina) {
        this.masina = masina;
    }

    @Override
    public void descriere() {
        System.out.println("Pachet cu masina inchiriata" + masina.toString());
    }

    @Override
    public void rezervaPachet() {
        masina.inchiriazaMasina();
    }

}
