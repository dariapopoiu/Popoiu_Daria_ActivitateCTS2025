package clase;

public class PachetTransport extends PachetTuristic {
    public PachetTransport(int codPachet) {
        super(codPachet);
    }

    @Override
    protected void cautaCazare(int codPachet) {

    }

    @Override
    protected void cautaTransport(int codPachet) {
        System.out.println("Se cauta Transport");
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
