package clase;

public class Oferta extends IOferta {

    public Oferta(String tipVacanta, String destinatie, boolean avionInclus, boolean allInclusive) {
        super(tipVacanta, destinatie, avionInclus, allInclusive);
    }

    @Override
    public Oferta clone() {
        Oferta ofertaNoua = new Oferta(tipVacanta,destinatie,avionInclus,allInclusive);
        return ofertaNoua;
    }


}
