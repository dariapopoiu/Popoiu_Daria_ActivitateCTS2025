package clase;

import java.util.HashMap;
import java.util.Map;

public class FactoryAutobuz {
    private Map<Integer,IAutobuz> colectieAutobuze;

    public FactoryAutobuz() {
        this.colectieAutobuze = new HashMap<Integer,IAutobuz>();
    }

    public IAutobuz getAutobuz(int cheie){
        IAutobuz autobuz = colectieAutobuze.get(cheie);
        if(autobuz == null){
            colectieAutobuze.put(cheie,new AutobuzLinie(cheie,"",0));
        }
        return autobuz;
    }

}
