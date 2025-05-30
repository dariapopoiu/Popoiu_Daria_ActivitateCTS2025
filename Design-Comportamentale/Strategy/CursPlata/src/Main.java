import clase.Cash;
import clase.Client;
import clase.Paypal;
import clase.Strategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Strategy cash = new Cash();
        Client client = new Client("Daria",cash);
        client.plateste(200);

        Client client2 = new Client("Andreea");
        client2.plateste(20);

        client2.setModPlata(new Paypal());
        client2.plateste(300);
    }
}