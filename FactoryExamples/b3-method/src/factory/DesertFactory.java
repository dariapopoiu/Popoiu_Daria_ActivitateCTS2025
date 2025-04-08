package factory;

import clase.FelMancare;
import clase.desert.Cheesecake;
import clase.desert.Clatite;
import clase.desert.Papanasi;

public class DesertFactory implements AbstractFactory {
    int gramaj;
    double pretPerSuta;
    int zahar;

    public DesertFactory(int gramaj, double pretPerSuta, int zahar) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
        this.zahar = zahar;
    }

    @Override
    public FelMancare clone(TipMancare tip, String ingrediente, int extra) {
        switch ((TipDesert)tip){
            case Papanasi :
                Papanasi papanasi = new Papanasi(gramaj,pretPerSuta,ingrediente,zahar,extra);
                return papanasi;
            case Cheesecake:
                Cheesecake cheesecake = new Cheesecake(gramaj,pretPerSuta,ingrediente,zahar,extra);
                return cheesecake;
            case Clatite:
                Clatite clatite = new Clatite(gramaj,pretPerSuta,ingrediente,zahar,extra);
                return clatite;
            default: return null;
        }
    }
}
