package clase;

public class HandlerManager extends Handler{
    @Override
    public void notificaClient(Client client, String mesaj) {
        System.out.println("NOTIFICARE Manager: "+mesaj);
    }
}
