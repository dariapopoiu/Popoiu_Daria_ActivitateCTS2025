package factory;

import clase.supa.Supa;
import clase.supa.SupaDeCiuperci;
import clase.supa.SupaDeVita;
import clase.supa.SupaLegume;

public class SupaFactory implements AbstractFactory{
    int gramaj;
    double pretPerSuta;
    int piper;

    public SupaFactory(int gramaj, double pretPerSuta,int piper) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
        this.piper = piper;
    }

    @Override
    public Supa clone(TipMancare tip,String ingrediente, int extra) {
        switch ((TipSupa) tip){
            case Vita :
                SupaDeVita supa1 = new SupaDeVita(gramaj,pretPerSuta,ingrediente,piper,extra);
                return supa1;
            case Legume:
                SupaLegume supa2= new SupaLegume(gramaj,pretPerSuta,ingrediente,piper,extra);
                return supa2;
            case Ciuperci:
                SupaDeCiuperci supa3 = new SupaDeCiuperci(gramaj,pretPerSuta,ingrediente,piper,extra);
                return supa3;
            default:
                return null;
        }
    }
}
