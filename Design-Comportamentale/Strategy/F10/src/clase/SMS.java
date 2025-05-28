package clase;

public class SMS implements ModPlata{
    @Override
    public void executaTranzactie(double suma) {
        System.out.println("Plata cu SMS");
    }
}
