package clase;

public class PrintareDecorata extends Decorator {

    public PrintareDecorata(IPrintare printare) {
        super(printare);
    }

    @Override
    public void printeazaBilet() {
        super.printare.printeazaBilet();
    }

    @Override
    public void printeazaBiletPersonalizat(String mesaj) {
        printeazaBilet();
        System.out.println(mesaj);
    }
}
