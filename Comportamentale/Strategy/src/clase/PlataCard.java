package clase;

public class PlataCard implements ModPlata {

    @Override
    public void plateste(Client client, double suma) {
        System.out.println("S-a facut plata CARD pentru clientul "+ client.getNume() + " suma de "+ suma+" Lei.");
    }
}
