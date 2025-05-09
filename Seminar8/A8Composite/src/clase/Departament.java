package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String nume;
    private List<IStructura> listaSubelemente;

    public Departament(String nume) {
        this.nume = nume;
        this.listaSubelemente = new ArrayList<IStructura>();
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Departamentul "+ this.nume+ " are  sectiile:" );
        for(IStructura sectie:listaSubelemente){
            sectie.afiseazaStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) {
        listaSubelemente.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) {
        listaSubelemente.remove(structura);
    }

    @Override
    public IStructura getNod(int index) {
        return listaSubelemente.get(index);
    }
}
