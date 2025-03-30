package factories;

import clase.Angajat;

public interface FactoryPersonal {
    Angajat cloneAngajat(TipPersonal tip, String nume , double salariu);
}
