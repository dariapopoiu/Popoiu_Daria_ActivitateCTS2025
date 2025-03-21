package clase;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, double pretPerSuta, String ingrediente,double pretSmantana) {
        super(gramaj, pretPerSuta, ingrediente);
        this.pretSmantana=pretSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita costa cu "+this.pretSmantana+" lei mai mult");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret()+pretSmantana;
    }
}
