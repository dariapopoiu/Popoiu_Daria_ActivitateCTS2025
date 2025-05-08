package clase;

public class NotificatorMail extends Notificator {

    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getEmail()!=null){
            System.out.println(client.getNume()+" ai primit pe EMAIL: "+ mesaj);
        }
        else {
            super.getUrmatorulNotificator().notificaClient(client,mesaj);
        }
    }
}
