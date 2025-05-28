package clase.supa;

public class SupaDeCiuperci extends Supa {
    private int gramajCiuperci;

    public SupaDeCiuperci(int gramaj, double pretPerSuta, String ingredientee, int cantitatePiper,int gramajCiuperci) {
        super(gramaj, pretPerSuta, ingredientee, cantitatePiper);
        this.gramajCiuperci = gramajCiuperci;
    }


    @Override
    public void preparaManacare() {
        System.out.println("Pt supa asta se folosesc " + this.gramaj + "gr ingrediente gr Ciuperci" + gramajCiuperci);
    }

}
