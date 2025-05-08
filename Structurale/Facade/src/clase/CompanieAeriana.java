package clase;

public class CompanieAeriana {
    private String companie;

    public CompanieAeriana(String companie) {
        this.companie = companie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana{");
        sb.append("companie='").append(companie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Zbor rezervaBilet(String plecare, String destinatie){
        Zbor zbor = new Zbor(plecare,destinatie,this);
        return zbor;
    }
}
