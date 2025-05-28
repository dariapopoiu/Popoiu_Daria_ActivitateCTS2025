package clase;

public class Optional{
    private boolean cina;
    private int nrExcursii;

    public Optional(boolean cina, int nrExcursii) {
        this.cina = cina;
        this.nrExcursii = nrExcursii;
    }

    public boolean isCina() {
        return cina;
    }

    public void setCina(boolean cina) {
        this.cina = cina;
    }

    public int getNrExcursii() {
        return nrExcursii;
    }

    public void setNrExcursii(int nrExcursii) {
        this.nrExcursii = nrExcursii;
    }

}
