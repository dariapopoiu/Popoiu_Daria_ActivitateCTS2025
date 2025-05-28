package clase;

public abstract class Decorator extends IPrintare {
    protected IPrintare printare;

    public Decorator(IPrintare printare) {
        this.printare = printare;
    }

    @Override
    public void printeazaBilet() {
        printare.printeazaBilet();
    }

    public abstract void printeazaBiletPersonalizat(String mesaj);
}
