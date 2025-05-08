package clase;

public class NotificatorTelefon extends Notificator {

    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getNrTelefon()!=null){
            System.out.println(client.getNume()+ " ai primit mesaj pe SMS: " + mesaj);
        }
        else {
            super.getUrmatorulNotificator().notificaClient(client,mesaj);
        }
    }
}
