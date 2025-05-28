package clase;

public class Client {
    private String numeClient;
    private String nrTelefon;
    private String Email;

    public Client(String numeClient, String nrTelefon, String email) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        Email = email;
    }

    public Client(String numeClient, String email) {
        this.numeClient = numeClient;
        Email = email;
    }

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getEmail() {
        return Email;
    }
}
