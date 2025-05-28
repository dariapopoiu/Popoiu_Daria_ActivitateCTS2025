package clase;

public class OfertaPachet extends AbstractOfertaPachet{
    public OfertaPachet(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anuleazaRezervare() {
        System.out.println("S-a anulat rezervarea!!");
    }
}
