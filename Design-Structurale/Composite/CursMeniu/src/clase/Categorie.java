package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    private List<Optiune> listaOptiuni;
    private String numeCategorie;

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        listaOptiuni = new ArrayList<Optiune>();
    }

    @Override
    public void adaugaOptiune(Optiune optiune) {
        listaOptiuni.add(optiune);
    }

    @Override
    public void stergeOptiune(Optiune optiune) {
        listaOptiuni.remove(optiune);
    }

    @Override
    public Optiune getOptiune(int index) {
        return listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("CATEGORIA: "+this.numeCategorie);
        System.out.println("------------------");
        int nr = 0;
        for(Optiune optiune : listaOptiuni){
            System.out.println("\t nr "+nr);
            optiune.descriere();
            nr++;
        }
    }
}
