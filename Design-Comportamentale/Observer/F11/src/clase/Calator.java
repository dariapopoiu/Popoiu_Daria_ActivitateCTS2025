package clase;

public class Calator implements Observer{
    @Override
    public void primesteNotif(String mesaj) {
        System.out.println("AI PRIMIT UN MESAJ: "+mesaj);
    }
}
