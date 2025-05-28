package clase;

public class SupaLegume extends Supa{
    private int gramajLegume;

    public SupaLegume(int gramaj, double pretPerSuta, String ingredientee,int gramajLegume) {
        super(gramaj, pretPerSuta, ingredientee);
        this.gramajLegume = gramajLegume;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Pt supa asta se folosesc " + this.gramaj + "gr ingrediente gr Legume" + gramajLegume);
    }
}
