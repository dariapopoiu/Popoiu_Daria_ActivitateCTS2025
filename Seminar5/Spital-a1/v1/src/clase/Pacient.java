package clase;

public class Pacient {
    private Boolean arePatRabatabil;
    private Boolean areMicDejun;
    private Boolean areHalat;
    private Boolean arePapuci;
    private String numeInsotitor;

    public Pacient() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.areHalat = false;
        this.arePapuci = false;
        this.numeInsotitor = "anonim";
    }

    public void setArePatRabatabil(Boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejun(Boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public void setAreHalat(Boolean areHalat) {
        this.areHalat = areHalat;
    }

    public void setArePapuci(Boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    public void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", numeInsotitor='").append(numeInsotitor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
