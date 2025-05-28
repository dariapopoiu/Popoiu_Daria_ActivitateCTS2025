package clase;

public class Paypal implements Strategy{
    @Override
    public void realizeazaPlata(String numeClient, double suma) {
        System.out.println("CLIENT: "+numeClient+" ; S-a realizat plata cu paypal");
    }
}
