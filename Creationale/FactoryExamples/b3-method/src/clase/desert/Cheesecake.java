package clase.desert;

public class Cheesecake extends Desert{
    private int extra;

    public Cheesecake(int gramaj, double pretPerSuta, String ingredientee, int cantitateZahar,int extra) {
        super(gramaj, pretPerSuta, ingredientee, cantitateZahar);
        this.extra = extra;
    }

    @Override
    public void preparaManacare() {
        System.out.println("Se prepara cheesecake cu :" + extra);
    }
}
