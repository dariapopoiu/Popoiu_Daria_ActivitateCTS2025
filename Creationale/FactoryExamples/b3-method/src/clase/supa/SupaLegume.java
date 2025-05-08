package clase.supa;

public class SupaLegume extends Supa{
    private int gramajLegume;

    public SupaLegume(int gramaj, double pretPerSuta, String ingredientee, int cantitatePiper,int gramajLeg) {
        super(gramaj, pretPerSuta, ingredientee, cantitatePiper);
        this.gramajLegume= gramajLeg;
    }


    @Override
    public void preparaManacare() {
        System.out.println("Pt supa asta se folosesc " + this.gramaj + "gr ingrediente gr lEGUME" + gramajLegume);
    }
}
