package clase;

public class PlataPayPal implements ModPlata{
    @Override
    public void plateste(Client client, double suma) {
        System.out.println("S-a facut plata PAYPAL pentru clientul "+ client.getNume() + " suma de "+ suma+" Lei.");

    }
}
