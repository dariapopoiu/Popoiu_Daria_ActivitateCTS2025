package ro.ase.clase;

public class AutoritatePescuitLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitLazy instanta=null;
    ///neapart privat pt singleton!!!!!!!!!!!!!!
    private AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    /// getter
    /// daca e syncronized e ThreadSafe
    public static synchronized AutoritatePescuitLazy getInstanta(String website, String denumire) {
        if(instanta==null)
        {
            instanta=new AutoritatePescuitLazy(denumire,website,100,100);
        }
        return instanta;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getWebsite() {
        return website;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public int getNrAutorizatiiEmise() {
        return nrAutorizatiiEmise;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public void setNrAutorizatiiEmise(int nrAutorizatiiEmise) {
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public void angajeaza(int nrAngajati){
        this.nrAngajati+= nrAngajati ;
    }

    public void concediaza(int nrAngajati){
        this.nrAngajati-= nrAngajati;
    }

    public void emiteAutorizatie(String numePersoana){
        System.out.println("A fost emisa autorizatia pentru "+ numePersoana);
        this.nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        return "AutoritatePescuitEager{" +
                "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", nrAutorizatiiEmise=" + nrAutorizatiiEmise +
                '}';
    }
}
