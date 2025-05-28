package clase;

public class AutobuzLinie implements IAutobuz{
    protected int codAutobuz;
    protected Cursa detaliiCursa;
    protected String model;
    protected int anFabricatie;

    public AutobuzLinie(int codAutobuz, Cursa detaliiCursa, String model, int anFabricatie) {
        this.codAutobuz = codAutobuz;
        this.detaliiCursa = detaliiCursa;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public AutobuzLinie(int codAutobuz, String model, int anFabricatie) {
        this.codAutobuz = codAutobuz;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void setCodAutobuz(int codAutobuz) {
        this.codAutobuz = codAutobuz;
    }

    public void setDetaliiCursa(Cursa detaliiCursa) {
        this.detaliiCursa = detaliiCursa;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public void descrieAutobuz() {
        System.out.println("AN FABRICATIE: "+this.anFabricatie+" ; MODEL:"+this.model);
        if(this.detaliiCursa != null)
            this.detaliiCursa.afiseazaDetalii();
    }
}
