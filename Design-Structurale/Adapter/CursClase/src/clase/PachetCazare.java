package clase;

public class PachetCazare implements PachetTuristic {

    @Override
    public void descriere() {
        System.out.println("Pachetul include DOAR cazare");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a rezevat pachet CAZARE");
    }
}
