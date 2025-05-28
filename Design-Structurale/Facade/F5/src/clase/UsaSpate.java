package clase;

public class UsaSpate implements Usa{
    @Override
    public void deschideUsa() {
        System.out.println("S-a deschis usa din spate");
    }

    @Override
    public void modLiberUsa() {
        System.out.println("S-a inchis usa din spate");
    }
}
