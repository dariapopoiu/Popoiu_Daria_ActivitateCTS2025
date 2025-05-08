package clase;

public abstract class Notificator {

    private Notificator urmatorulNotificator;

    public Notificator getUrmatorulNotificator() {
        return urmatorulNotificator;
    }

    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public abstract void notificaClient(Client client, String mesaj);
}
