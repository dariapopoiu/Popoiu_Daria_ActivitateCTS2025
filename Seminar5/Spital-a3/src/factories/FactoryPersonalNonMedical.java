package factories;

import clase.Angajat;
import clase.Portar;
import clase.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat cloneAngajat(TipPersonal tip, String nume, double salariu) {
        return switch((TipPersonalNonMedical)tip){
            case SECRETAR -> new Secretar(nume,salariu,vechime);
            case PORTAR -> new Portar(nume,salariu,vechime);
            default -> null;
        };
    }
}
