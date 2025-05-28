package clase;

public class PachetTransport implements PachetTuristic{
    private Persoana persoana;

    public PachetTransport(Persoana persoana) {
        this.persoana = persoana;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void descriePachet() {
        System.out.println("Pachet TRANSPORT");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("ati rezervat pachet transport");
    }
}
