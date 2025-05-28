package clase;

public class Facade {
    public void deschideFortatUsi(){
        UsaFata usaFata = new UsaFata();
        UsaSpate usaSpate = new UsaSpate();
        UsaMijloc usaMijloc = new UsaMijloc();

        usaFata.deschideUsa();
        usaMijloc.deschideUsa();
        usaSpate.deschideUsa();
    }

    public void deschideModLiber(Usa usa){
        usa.modLiberUsa();
    }

}
