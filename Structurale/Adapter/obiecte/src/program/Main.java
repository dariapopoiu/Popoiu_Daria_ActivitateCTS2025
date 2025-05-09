package program;// Agenția de turism AgeTur dorește să se ocupe și de închiriat mașini pentru
//clienții săi. De aceea cumpără un soft pentru închiriat mașini, însă
//operatorul trebuie să intre în fiecare aplicație pentru rezervarea unui
//pachet complet de cazare, transport și mașină închiriată.
// Clasele din softul achiziționat **nu sunt asemănătoare cu clasele din softul
// deținut de agenție.**
// Să se rezolve problema, astfel încât, cele două soft-uri să poată fi **folosite
// impreună**, însă **fără a modifica clasele** din cele două soft-uri

import clase.Masina;
import clase.MasinaInchiriata;
import clase.PachetInchiriereMasina;
import clase.PachetTuristic;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.print("Pentru client: ");
        pachetTuristic.descriePachet();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezerva();
    }


    public static void main(String[] args) {

        MasinaInchiriata masinaDeInchiriat = new MasinaInchiriata(new Masina("Audi A4",3000));
        PachetTuristic pachetMasina = new PachetInchiriereMasina(masinaDeInchiriat);

        printeazaRezervare(pachetMasina);

    }
}