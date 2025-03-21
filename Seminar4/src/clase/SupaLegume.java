package clase;

public class SupaLegume extends Supa {
    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSuta, String ingrediente,double gramajCrutoane) {
        super(gramaj, pretPerSuta, ingrediente);
        this.gramajCrutoane=gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu "+this.gramajCrutoane+" grame crutoane");
    }

    @Override
    public double calculeazaPret() {
        return (super.calculeazaPret()+(gramajCrutoane/100)*getPretPerSuta())*2;
    }

}
