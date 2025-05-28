package clase;

public class Autobuz implements IAutobuz{
    protected int nrOameni;

    public Autobuz(int nrOameni) {
        this.nrOameni = nrOameni;
    }

    @Override
    public void opresteStatie() {
        System.out.println("Opreste in statie");
    }
}
