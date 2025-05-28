package clase;

public class Calator {
    private ModPlata modPlata;

    public Calator() {
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void achitaCalatorie(double suma){
        modPlata.executaTranzactie(suma);
    }
}
