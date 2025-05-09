package clase;

import flyweight.Spitalizare;

public class Pacient implements  PacientAbstract{
    private String nume;
    private String nrTelefon;
    private String adresa;

    protected Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afisareInformatii(Spitalizare spitalizare) {
        System.out.println("Pacientul "+ this.nume+ " ; nr de telefon :" +  this.nrTelefon+ " ; adresa: " + this.adresa +"\n Internari:"+ spitalizare.toString());
    }
}
