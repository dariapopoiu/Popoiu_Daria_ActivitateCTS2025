package clase.desert;

public class Clatite extends Desert{
    private int extra;

    public Clatite(int gramaj, double pretPerSuta, String ingredientee, int cantitateZahar,int extra) {
        super(gramaj, pretPerSuta, ingredientee, cantitateZahar);
        this.extra = extra;
    }

    @Override
    public void preparaManacare() {
        System.out.println("Se prepara CLATITE cu :" + extra);
    }
}
