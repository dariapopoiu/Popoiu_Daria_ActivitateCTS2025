package clase;

public abstract class PachetTuristic {
    protected int codPachet;

    public PachetTuristic(int codPachet) {
        this.codPachet = codPachet;
    }

    protected abstract void cautaCazare(int codPachet);
    protected abstract void cautaTransport(int codPachet);
    protected abstract void rezervaPachet(int codPachet);
    protected abstract void platirePachet(int codPachet);

    //!!!!!!!!
    public final void vindePachet(){
        cautaCazare(codPachet);
        cautaTransport(codPachet);
        rezervaPachet(codPachet);
        platirePachet(codPachet);
    }
}
