package dubluri;

import clase.IPersoana;
import clase.Persoana;

public class PersoanaFake extends Persoana {
    private int varstaFake;

    public void setVarsta(int varsta) {
        this.varstaFake = varsta;
    }

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return varstaFake;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
