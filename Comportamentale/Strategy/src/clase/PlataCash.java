package clase;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(Client client, double suma) {
        System.out.println("S-a facut plata CASH pentru clientul "+ client.getNume() + " suma de "+ suma+" Lei.");

    }
}
