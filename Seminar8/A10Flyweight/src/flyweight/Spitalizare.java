package flyweight;

public class Spitalizare {
    private int nrPat;
    private int nrSalon;
    private int nrZile;

    public Spitalizare(int nrPat, int nrSalon, int nrZile) {
        this.nrPat = nrPat;
        this.nrSalon = nrSalon;
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("nrPat=").append(nrPat);
        sb.append(", nrSalon=").append(nrSalon);
        sb.append(", nrZile=").append(nrZile);
        sb.append('}');
        return sb.toString();
    }
}
