package program;


import clase.Masina;
import clase.MasinaInchiriata;
import clase.PachetInchiriereMasina;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("Seria 5",5000);
        PachetTuristic pachet = new PachetInchiriereMasina(masina);

        pachet.descriePachet();
        pachet.rezerva();
    }
}