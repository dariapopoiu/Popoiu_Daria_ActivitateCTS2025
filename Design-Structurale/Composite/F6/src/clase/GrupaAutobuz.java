package clase;

import java.util.ArrayList;
import java.util.List;

public class GrupaAutobuz extends AbstractAutobuz{
    private String denumire;
    private List<AbstractAutobuz> autobuze;

    public GrupaAutobuz(String denumire) {
        this.denumire = denumire;
        autobuze = new ArrayList<AbstractAutobuz>();
    }

    @Override
    public void vizualizeazaDetalii() {
        System.out.println("-----------");
        System.out.println("GRUPUL "+this.denumire);
        for(AbstractAutobuz autobuz : autobuze){
            autobuz.vizualizeazaDetalii();
        }
        System.out.println("---------------");
    }

    @Override
    public void adaugaAutobuz(AbstractAutobuz autobuz) {
        autobuze.add(autobuz);
    }

    @Override
    public void stergeAutobuz(AbstractAutobuz autobuz) {
        autobuze.remove(autobuz);
    }

    @Override
    public AbstractAutobuz getAutobuz(int index) {
        return autobuze.get(index);
    }
}
