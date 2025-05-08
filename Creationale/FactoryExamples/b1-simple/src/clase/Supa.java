package clase;

public abstract class Supa {
    protected int gramaj;
    protected double pretPerSuta;
    protected String ingredientee;

    public Supa(int gramaj, double pretPerSuta, String ingredientee) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
        this.ingredientee = ingredientee;
    }

    public abstract void preparaSupa();

    public double calculeazaPret(){
        return gramaj*pretPerSuta/100 ;
    };


}
