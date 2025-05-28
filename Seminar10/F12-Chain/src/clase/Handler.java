package clase;

public abstract class Handler {
    protected Handler urmator;

    public Handler() {
    }

    public void setUrmator(Handler urmator) {
        this.urmator = urmator;
    }

    public Handler getUrmator() {
        return urmator;
    }

    public abstract void parcurgeDrum(int distanta);

}
