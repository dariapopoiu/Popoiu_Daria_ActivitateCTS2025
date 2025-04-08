package clase;

public class Rezervare {
    private boolean setAsezareLaGeam;
    private boolean setScauneErgonomice;
    private boolean setDecorareMasa;
    private boolean setMuzicaAmbientala;
    private boolean setGenMuzica;

    public Rezervare(boolean setAsezareLaGeam, boolean setScauneErgonomice, boolean setDecorareMasa, boolean setMuzicaAmbientala, boolean setGenMuzica) {
        this.setAsezareLaGeam = setAsezareLaGeam;
        this.setScauneErgonomice = setScauneErgonomice;
        this.setDecorareMasa = setDecorareMasa;
        this.setMuzicaAmbientala = setMuzicaAmbientala;
        this.setGenMuzica = setGenMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("setAsezareLaGeam=").append(setAsezareLaGeam);
        sb.append(", setScauneErgonomice=").append(setScauneErgonomice);
        sb.append(", setDecorareMasa=").append(setDecorareMasa);
        sb.append(", setMuzicaAmbientala=").append(setMuzicaAmbientala);
        sb.append(", setGenMuzica=").append(setGenMuzica);
        sb.append('}');
        return sb.toString();
    }
}
