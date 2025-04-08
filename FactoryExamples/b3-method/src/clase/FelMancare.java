package clase;

public abstract class FelMancare {
    protected int gramaj;
    protected double pretPerSuta;
    protected String ingredientee;

    public FelMancare(int gramaj, double pretPerSuta, String ingredientee) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
        this.ingredientee = ingredientee;
    }

    public abstract void preparaManacare();
}
