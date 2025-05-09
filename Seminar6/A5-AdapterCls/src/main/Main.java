package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");

        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paduden",15);
        IMedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Coldrex",15);
        farmacie.vindeMedicamnete(medicamentFarmacie);
        farmacie.vindeMedicamnete(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen",35,true);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("ACC",35,true);
        AdapterMedicamentSpital medicament = new AdapterMedicamentSpital(medicamentSpital.getNume(), medicamentSpital.getPret(), medicamentSpital.isEsteInStoc());
        AdapterMedicamentSpital medicament2 = new AdapterMedicamentSpital(medicamentSpital2.getNume(), medicamentSpital2.getPret(), medicamentSpital2.isEsteInStoc());

        farmacie.vindeMedicamnete(medicament);
        farmacie.vindeMedicamnete(medicament2);
    }
}