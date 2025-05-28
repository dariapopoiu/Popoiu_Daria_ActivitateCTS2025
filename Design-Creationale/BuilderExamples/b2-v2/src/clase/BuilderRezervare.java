package clase;

public class BuilderRezervare implements Builder {

    // v2 --- are atributele clasei
    private boolean setAsezareLaGeam;
    private boolean setScauneErgonomice;
    private boolean setDecorareMasa;
    private boolean setMuzicaAmbientala;
    private boolean setGenMuzica;

    // constructorul seteaza optiunile la false
    public BuilderRezervare() {
        this.setAsezareLaGeam = false;
        this.setScauneErgonomice = false;
        this.setDecorareMasa = false;
        this.setMuzicaAmbientala = false;
        this.setGenMuzica = false;
    }

    public BuilderRezervare setSetAsezareLaGeam(boolean setAsezareLaGeam) {
        this.setAsezareLaGeam = setAsezareLaGeam;
        return this;
    }

    public BuilderRezervare  setSetScauneErgonomice(boolean setScauneErgonomice) {
        this.setScauneErgonomice = setScauneErgonomice;
        return this;
    }

    public BuilderRezervare  setSetDecorareMasa(boolean setDecorareMasa) {
        this.setDecorareMasa = setDecorareMasa;
        return this;
    }

    public BuilderRezervare  setSetMuzicaAmbientala(boolean setMuzicaAmbientala) {
        this.setMuzicaAmbientala = setMuzicaAmbientala;
        return this;
    }

    public BuilderRezervare  setSetGenMuzica(boolean setGenMuzica) {
        this.setGenMuzica = setGenMuzica;
        return this;
    }

    // se creeaza la final obiectul
    @Override
    public Rezervare build() {
        return new Rezervare(setAsezareLaGeam,setScauneErgonomice,setDecorareMasa,setMuzicaAmbientala,setGenMuzica);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BuilderRezervare{");
        sb.append("setAsezareLaGeam=").append(setAsezareLaGeam);
        sb.append(", setScauneErgonomice=").append(setScauneErgonomice);
        sb.append(", setDecorareMasa=").append(setDecorareMasa);
        sb.append(", setMuzicaAmbientala=").append(setMuzicaAmbientala);
        sb.append(", setGenMuzica=").append(setGenMuzica);
        sb.append('}');
        return sb.toString();
    }

    private void reset(){

    }
}
