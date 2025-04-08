package clase;

public abstract class IOferta {
    protected String tipVacanta;
    protected String destinatie;
    protected boolean avionInclus;
    protected boolean allInclusive;

    public IOferta(String tipVacanta, String destinatie, boolean avionInclus, boolean allInclusive) {
        this.tipVacanta = tipVacanta;
        this.destinatie = destinatie;
        this.avionInclus = avionInclus;
        this.allInclusive = allInclusive;
    }

    public abstract Oferta clone();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IOferta{");
        sb.append("tipVacanta='").append(tipVacanta).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", avionInclus=").append(avionInclus);
        sb.append(", allInclusive=").append(allInclusive);
        sb.append('}');
        return sb.toString();
    }
}
