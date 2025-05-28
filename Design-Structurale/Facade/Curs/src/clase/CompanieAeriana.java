package clase;

public class CompanieAeriana {
    private String numeCompanie;

    public CompanieAeriana(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    protected Zbor rezervaBilet(int nrLoc,String destinatie)
    {
        Zbor zbor = new Zbor(nrLoc,destinatie);
        return zbor;
    }
}
