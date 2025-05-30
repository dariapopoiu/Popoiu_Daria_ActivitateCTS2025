import clase.Facade;
import clase.Usa;
import clase.UsaMijloc;

public class Main {
    public static void main(String[] args) {
        Facade autobuz = new Facade();
        autobuz.deschideFortatUsi();
        System.out.println("---------");
        Usa usaMijloc = new UsaMijloc();
        autobuz.deschideModLiber(usaMijloc);
    }
}