package clase;

public class Zbor {
    private int nrLoc;
    private String destinatie;

    public Zbor(int nrLoc, String destinatie) {
        this.nrLoc = nrLoc;
        this.destinatie = destinatie;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("nrLoc=").append(nrLoc);
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
