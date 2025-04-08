package clase;

public class SupaDeCiuperci extends Supa {
    private int gramajCiuperci;

    public SupaDeCiuperci(int gramaj, double pretPerSuta, String ingredientee,int gramajCiuperci) {
        super(gramaj,pretPerSuta,ingredientee);
        this.gramajCiuperci = gramajCiuperci;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Pt supa asta se folosesc " + this.gramaj + "gr ingrediente gr Ciuperci" + gramajCiuperci);
    }
}
