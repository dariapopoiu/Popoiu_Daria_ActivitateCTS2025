package factory;

import clase.Supa;
import clase.SupaDeCiuperci;
import clase.SupaDeVita;
import clase.SupaLegume;

public class SupaFactory implements AbstractFactory{
    int gramaj;
    double pretPerSuta;

    public SupaFactory(int gramaj, double pretPerSuta) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
    }

    @Override
    public Supa clone(TipSupa tip,String ingrediente, int extra) {
        switch (tip){
            case Vita :
                SupaDeVita supa1 = new SupaDeVita(gramaj,pretPerSuta,ingrediente,extra);
                return supa1;
            case Legume:
                SupaLegume supa2= new SupaLegume(gramaj,pretPerSuta,ingrediente,extra);
                return supa2;
            case Ciuperci:
                SupaDeCiuperci supa3 = new SupaDeCiuperci(gramaj,pretPerSuta,ingrediente,extra);
                return supa3;
            default:
                return null;
        }
    }
}
