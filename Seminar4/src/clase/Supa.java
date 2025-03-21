package clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSuta;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSuta, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
        this.ingrediente = ingrediente;
    }

    public double calculeazaPret() {
        return (gramaj*pretPerSuta)/100;
    }

    public abstract void preparareSupa();

    public double getPretPerSuta() {
        return pretPerSuta;
    }
}
