package clase.desert;

import clase.FelMancare;

public abstract class Desert extends FelMancare {
    protected int cantitateZahar;

    public Desert(int gramaj, double pretPerSuta, String ingredientee,int cantitateZahar) {
        super(gramaj, pretPerSuta, ingredientee);
        this.cantitateZahar = cantitateZahar;
    }

    @Override
    public void preparaManacare() {
        System.out.println(" se prepara desertul cu zahar"+ cantitateZahar);
    }
}
