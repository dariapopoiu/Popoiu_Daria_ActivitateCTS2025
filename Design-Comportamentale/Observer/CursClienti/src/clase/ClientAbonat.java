package clase;

public class ClientAbonat implements Observer{
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.numeClient+" ai primit urmatorul mesaj: "+mesaj);
    }
}
