package clase;

public class UsaMijloc implements Usa{
    @Override
    public void deschideUsa() {
        System.out.println("S-a deschis usa din mijloc");
    }

    @Override
    public void modLiberUsa() {
        System.out.println("S-a inchis usa din inchide");
    }
}
