package clase;

public class FrunzaAutobuz extends AbstractAutobuz{
    protected String producator;
    protected String model;
    protected int nrLocuri;

    public FrunzaAutobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void vizualizeazaDetalii() {
        System.out.println("Autobuzul => Producator: "+this.producator+" Model: "+this.model+" Nr locuri: "+this.nrLocuri);
    }

    @Override
    public void adaugaAutobuz(AbstractAutobuz autobuz) throws Exception {
        throw new Exception("Nu este implementata functionalitatea");
    }

    @Override
    public void stergeAutobuz(AbstractAutobuz autobuz) throws Exception {
        throw new Exception("Nu este implementata functionalitatea");
    }

    @Override
    public AbstractAutobuz getAutobuz(int index) throws Exception {
        throw new Exception("Nu este implementata functionalitatea");
    }
}
