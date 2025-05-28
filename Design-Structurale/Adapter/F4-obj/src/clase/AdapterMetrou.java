package clase;

public class AdapterMetrou extends Metrou{
    private Autobuz autobuz;

    public AdapterMetrou(String nrMetrou,Autobuz autobuz) {
        super(nrMetrou);
        this.autobuz = autobuz;
    }

    @Override
    public void valideazaBilet() {
        autobuz.valideazaLinieBilet();
    }

    @Override
    public void valideazaAbonament() {
        autobuz.valideazaLinieBilet();
    }
}
