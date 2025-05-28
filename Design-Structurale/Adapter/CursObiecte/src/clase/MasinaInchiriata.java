package clase;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("S-a inchiriat masina:"+ masina.toString());
    }
}
