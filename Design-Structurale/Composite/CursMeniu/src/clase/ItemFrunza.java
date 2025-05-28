package clase;

public class ItemFrunza implements Optiune{
    private String numeItem;

    public ItemFrunza(String numeItem) {
        this.numeItem = numeItem;
    }

    @Override
    public void adaugaOptiune(Optiune optiune) throws Exception {
        throw new Exception("NU E IMPLEMENTAT");
    }

    @Override
    public void stergeOptiune(Optiune optiune) throws Exception {
        throw new Exception("NU E IMPLEMENTAT");
    }

    @Override
    public Optiune getOptiune(int index) throws Exception {
        throw new Exception("NU E IMPLEMENTAT");
    }

    @Override
    public void descriere() {
        System.out.println("Item: "+this.numeItem);
    }
}
