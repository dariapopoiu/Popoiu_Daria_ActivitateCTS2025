package factories;

import clase.Angajat;
import clase.Asistent;
import clase.Medic;

import static factories.TipPersonalMedical.ASISTENT;
import static factories.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat cloneAngajat(TipPersonal tip, String nume, double salariu) {
        return switch((TipPersonalMedical) tip){
            case MEDIC -> new Medic(nume,salariu,spor);
            case ASISTENT -> new Asistent(nume,salariu,spor);
            default -> null;
        };

    }
}
