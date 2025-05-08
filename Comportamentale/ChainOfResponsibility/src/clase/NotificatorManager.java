package clase;

public class NotificatorManager  extends Notificator{
    @Override
    public void notificaClient(Client client, String mesaj) {
        System.out.println("Nu s-a putut trimite notificarea:'"+ mesaj +"' clientului "+ client.getNume());
    }
}
