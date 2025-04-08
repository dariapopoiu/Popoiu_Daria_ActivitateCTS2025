package clase;

public class SupaDeVita extends Supa{
    private int gramajVita;

    public SupaDeVita(int gramaj, double pretPerSuta, String ingredientee,int gramajVita) {
        super(gramaj, pretPerSuta, ingredientee);
        this.gramajVita = gramajVita;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Pt supa asta se folosesc " + this.gramaj+ "gr ingrediente si Vita" + gramajVita);
    }

    @Override
    public double calculeazaPret() {
        double pret = super.calculeazaPret() + pretPerSuta*gramajVita/100;
        return pret;
    }
}
