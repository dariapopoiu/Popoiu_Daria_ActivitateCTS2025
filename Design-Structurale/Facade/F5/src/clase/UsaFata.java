package clase;

public class UsaFata implements Usa {

    @Override
    public void deschideUsa() {
        System.out.println("S-a deschis usa din fata");
    }

    @Override
    public void modLiberUsa() {
        System.out.println("S-a inchis usa din fata");
    }
}
