package clase;

public abstract class Handler {
    private Handler urmatorulHandler;

    public void setUrmatorulHandler(Handler urmatorulHandler) {
        this.urmatorulHandler = urmatorulHandler;
    }

    public Handler getUrmatorulHandler() {
        return urmatorulHandler;
    }

    public abstract void notificaClient(Client client, String mesaj);

}
