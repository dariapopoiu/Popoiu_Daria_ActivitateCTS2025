package singleton.registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {

    private String denumire;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instanta=null;

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static AutoritatePescuit getInstanta() {
        if(instanta==null){
            instanta=new AutoritatePescuit("annpa","wwww",101);
        }
        return instanta;
    }

    private Map<String,Autorizatie> autorizatiiEmise=new HashMap<>();

    public Autorizatie emiteAutorizatii(String nume){

        if(!autorizatiiEmise.containsKey(nume)){
            autorizatiiEmise.put(nume,new Autorizatie(nume,autorizatiiEmise.size()+1,new Date().toString()));
        }

        return autorizatiiEmise.get(nume);
    }
}
