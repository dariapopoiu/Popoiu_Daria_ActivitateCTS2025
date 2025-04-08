package factory;

import clase.Supa;

public interface AbstractFactory {
    Supa clone(TipSupa tip,String ingrediente, int extra);
}
