package clase;

public class Zbor {
    private String plecare;
    private String destinatie;
    private CompanieAeriana companieAeriana;

    public Zbor(String plecare, String destinatie,CompanieAeriana companieAeriana) {
        this.plecare = plecare;
        this.destinatie = destinatie;
        this.companieAeriana = companieAeriana;
    }

    public String getPlecare() {
        return plecare;
    }

    public void setPlecare(String plecare) {
        this.plecare = plecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }

    public void setCompanieAeriana(CompanieAeriana companieAeriana) {
        this.companieAeriana = companieAeriana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("plecare='").append(plecare).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", companieAeriana=").append(companieAeriana);
        sb.append('}');
        return sb.toString();
    }
}
