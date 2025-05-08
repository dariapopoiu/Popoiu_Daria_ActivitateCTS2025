package clase;

public class ClientFidel implements Observer{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.nume +" ai primit mesajul: "+ mesaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientFidel{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
