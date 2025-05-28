package clase;

public class HandlerSMS extends Handler{
    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getNrTelefon()== null){
            super.getUrmatorulHandler().notificaClient(client,mesaj);
        }
        else{
            System.out.println("NOTIFICARE SMS: "+mesaj);
        }
    }
}
