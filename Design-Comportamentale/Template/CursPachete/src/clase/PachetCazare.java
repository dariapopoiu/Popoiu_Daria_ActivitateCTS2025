package clase;

public class PachetCazare extends PachetTuristic{
    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    protected void cautaCazare(int codPachet) {
        System.out.println("Se cauta Cazare ");
    }

    @Override
    protected void cautaTransport(int codPachet) {
    }

    @Override
    protected void rezervaPachet(int codPachet) {
        System.out.println("S-a rezervat pachetul transport");
    }

    @Override
    protected void platirePachet(int codPachet) {
        System.out.println("S-a platit pachetul");
    }
}
