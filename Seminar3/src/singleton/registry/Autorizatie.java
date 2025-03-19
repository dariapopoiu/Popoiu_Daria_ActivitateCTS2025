package singleton.registry;

public class Autorizatie {

    private String detinator;
    private int nrAutorizatie;
    private String data;

    Autorizatie(String detinator, int nrAutorizatie, String data) {
        this.detinator = detinator;
        this.nrAutorizatie = nrAutorizatie;
        this.data = data;
    }


    @Override
    public String toString() {
        return "Autorizatie{" +
                "detinator='" + detinator + '\'' +
                ", nrAutorizatie=" + nrAutorizatie +
                ", data='" + data + '\'' +
                '}';
    }
}
