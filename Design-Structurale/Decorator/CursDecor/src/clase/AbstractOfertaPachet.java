package clase;

public abstract class AbstractOfertaPachet implements PachetTuristic {
    private PachetTuristic pachetTuristic;

    public AbstractOfertaPachet(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }

    public abstract void anuleazaRezervare();
}
