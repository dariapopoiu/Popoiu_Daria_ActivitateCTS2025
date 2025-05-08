package clase;

public abstract class PachetTuristic {
    protected int codPachet;

    public PachetTuristic(int codPachet) {
        this.codPachet = codPachet;
    }

    public abstract void cautaCazare(int cod);
    public abstract void cautaTransport(int cod);
    public abstract void rezervaPachet(int cod);
    public abstract void platestePachet(int cod);

    public void vindePachet(){
        cautaCazare(this.codPachet);
        cautaTransport(this.codPachet);
        rezervaPachet(this.codPachet);
        platestePachet(this.codPachet);
    }
}
