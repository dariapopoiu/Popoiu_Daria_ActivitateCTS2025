package clase;

public class HandlerEmail extends Handler{
    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getEmail()==null){
            super.getUrmatorulHandler().notificaClient(client,mesaj);
        }
        else{
            System.out.println("NOTIFICARE Email: "+mesaj);
        }
    }
}
