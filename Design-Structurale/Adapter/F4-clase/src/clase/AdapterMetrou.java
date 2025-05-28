package clase;

public class AdapterMetrou extends Metrou implements IAutobuz{

    public AdapterMetrou(String nrMetrou) {
        super(nrMetrou);
    }

    @Override
    public void valideazaLinieBilet() {
        this.valideazaBilet();
    }

    @Override
    public void valideazaLinieAbonament() {
        this.valideazaAbonament();
    }
}
