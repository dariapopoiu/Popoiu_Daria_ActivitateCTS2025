package clase;

public class PachetCazare extends PachetTuristic {
    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cautaCazare(int cod) {
        System.out.println("S-a gasit cazare pentru pachetul cu cod:"+ this.codPachet);

    }

    @Override
    public void cautaTransport(int cod) {
    }

    @Override
    public void rezervaPachet(int cod) {
        System.out.println("S-a rezervat pachetul "+ this.codPachet);
    }

    @Override
    public void platestePachet(int cod) {
        System.out.println("S-a platit pachetul cu codul:"+ this.codPachet);
    }
}
