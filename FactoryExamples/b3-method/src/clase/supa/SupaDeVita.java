package clase.supa;

public class SupaDeVita extends Supa{
    private int gramajVita;

    public SupaDeVita(int gramaj, double pretPerSuta, String ingredientee, int cantitatePiper,int gramajVita) {
        super(gramaj, pretPerSuta, ingredientee, cantitatePiper);
        this.gramajVita = gramajVita;
    }


    @Override
    public void preparaManacare() {
        System.out.println("Pt supa asta se folosesc " + this.gramaj + "gr ingrediente gr Vita" + gramajVita);
    }
}
