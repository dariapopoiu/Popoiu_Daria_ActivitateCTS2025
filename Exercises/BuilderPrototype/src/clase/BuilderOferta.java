package clase;

public class BuilderOferta implements AbstractBuilder{

    // a doua versiune are atributele si are setteri
    private String tipVacanta;
    private String destinatie;
    private boolean avionInclus;
    private boolean allInclusive;

    public BuilderOferta() {
        this.allInclusive = false;
        this.tipVacanta = "Necunoscut";
        this.avionInclus = false;
        this.destinatie = "Necunoscut";
    }

    public BuilderOferta setTipVacanta(String tipVacanta) {
        this.tipVacanta = tipVacanta;
        return this;
    }

    public BuilderOferta setDestinatie(String destinatie) {
        this.destinatie = destinatie;
        return this;
    }

    public BuilderOferta setAvionInclus(boolean avionInclus) {
        this.avionInclus = avionInclus;
        return this;
    }

    public BuilderOferta setAllInclusive(boolean allInclusive) {
        this.allInclusive = allInclusive;
        return this;
    }

    public Oferta copy(){
        Oferta ofertaClona = new Oferta(this.tipVacanta,this.destinatie,this.avionInclus,this.allInclusive);
        return ofertaClona;
    }

    @Override
    public Oferta build() {
        return new Oferta(tipVacanta,destinatie,avionInclus,allInclusive);
    }
}
