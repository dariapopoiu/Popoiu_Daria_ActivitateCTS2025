import clase.BuilderOferta;
import clase.Oferta;

public class Main {
    public static void main(String[] args) {
        BuilderOferta builderOferta = new BuilderOferta();
        Oferta oferta1 = builderOferta.setAllInclusive(true).setDestinatie("Mangalia").build();
        Oferta oferta2 = builderOferta.setDestinatie("Bulgaria").build();

        System.out.println(oferta1);
        System.out.println(oferta2);

        Oferta oferta3 = builderOferta.copy();
        System.out.println(oferta3);
        System.out.println(oferta3);

        System.out.println(oferta1);
    }
}