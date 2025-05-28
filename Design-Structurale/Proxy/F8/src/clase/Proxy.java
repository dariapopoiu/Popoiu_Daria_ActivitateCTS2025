package clase;

public class Proxy implements IAutobuz{
    private Autobuz autobuz;

    public Proxy(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteStatie() {
        if(autobuz.nrOameni == 0){
            System.out.println("NU MAI OPRESTE IN STATIE");
        }
        else{
            autobuz.opresteStatie();
        }
    }
}
