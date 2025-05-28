package clase;

public abstract class AbstractAutobuz {
    public abstract void vizualizeazaDetalii();

    public abstract void adaugaAutobuz(AbstractAutobuz autobuz) throws Exception;
    public abstract void stergeAutobuz(AbstractAutobuz autobuz) throws Exception;
    public abstract AbstractAutobuz getAutobuz(int index) throws Exception;

}
