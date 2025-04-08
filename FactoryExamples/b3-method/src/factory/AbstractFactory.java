package factory;

import clase.FelMancare;

public interface AbstractFactory {
    FelMancare clone(TipMancare tip, String ingrediente, int extra);
}
