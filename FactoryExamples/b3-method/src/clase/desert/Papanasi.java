package clase.desert;

public class Papanasi extends Desert{
    private int extra;

    public Papanasi(int gramaj, double pretPerSuta, String ingredientee, int cantitateZahar,int extra) {
        super(gramaj, pretPerSuta, ingredientee, cantitateZahar);
        this.extra = extra;
    }

    @Override
    public void preparaManacare() {
        System.out.println("Se prepara PAPANASI cu :" + extra);
    }
}
