package clase;

public class CardBancar implements ModPlata{
    @Override
    public void executaTranzactie(double suma) {
        System.out.println("Plata cu card bancar");
    }
}
