package factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class SupaFactory {
    private int gramaj;
    private double pretPerSuta;

    public Supa getSupa(double gramajExtra,String ingrediente,TipSupa tip) {
        switch (tip){
            case supaDeCiuperci:
                return new SupaCiuperci(this.gramaj,this.pretPerSuta,ingrediente,gramajExtra);
            case supaDeLegume:
                return new SupaLegume(this.gramaj,this.pretPerSuta,ingrediente,gramajExtra);
            case supaDeVita:
                return new SupaVita(this.gramaj,this.pretPerSuta,ingrediente,gramajExtra);
            default:
                return null;
        }
    }

}
