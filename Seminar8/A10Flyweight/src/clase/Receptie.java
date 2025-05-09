package clase;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String,PacientAbstract> listaPacienti;

    public Receptie() {
        this.listaPacienti = new HashMap<String,PacientAbstract>();
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresa){

        if(!listaPacienti.containsKey(nume)){
            listaPacienti.put(nume,new Pacient(nume,nrTelefon,adresa));
        }
        return listaPacienti.get(nume);

    }

    public PacientAbstract getPacient(String nume) throws Exception {

        if(listaPacienti.containsKey(nume)){
            return listaPacienti.get(nume);
        }
        else {
            throw new Exception("Nu s-a gasit pacientul");
        }

    }

}
