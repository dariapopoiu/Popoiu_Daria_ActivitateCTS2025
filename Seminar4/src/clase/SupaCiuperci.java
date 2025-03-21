package clase;

public class SupaCiuperci extends Supa {
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSuta, String ingrediente,double cantitateCiuperci) {
        super(gramaj, pretPerSuta, ingrediente);
        this.cantitateCiuperci=cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu "+this.cantitateCiuperci+" grame de ciuperci");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret()+(cantitateCiuperci/100)*getPretPerSuta();
    }
}
