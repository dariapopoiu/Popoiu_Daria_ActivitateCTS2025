package clase;

public class Sectie implements IStructura{
    private String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Sectia " + this.denumire);
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception("Nu este implementata!!");
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception("Nu este implementata!!");
    }

    @Override
    public IStructura getNod(int index) throws Exception {
        throw new Exception("Nu este implementata!!");
    }
}
