package clase;

public class NotaCraciun extends AbstractDecorator {
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("Cracun fericit!");
    }

}
