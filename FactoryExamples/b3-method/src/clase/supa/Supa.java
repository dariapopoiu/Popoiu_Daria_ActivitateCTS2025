package clase.supa;

import clase.FelMancare;

public abstract class Supa extends FelMancare {
    protected int cantitatePiper;

    public Supa(int gramaj, double pretPerSuta, String ingredientee,int cantitatePiper) {
        super(gramaj, pretPerSuta, ingredientee);
        this.cantitatePiper = cantitatePiper;
    }

    @Override
    public void preparaManacare() {
        System.out.println(" se prepara supa cu piper"+ cantitatePiper);
    }

}
