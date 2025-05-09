package main;

//A.5. Spitalul deține un mic magazin pentru medicamente și au o aplicație pentru cumpărarea d
//medicamente pe baza de rețetă. Spitalul închei un contrat cu o farmacie specializată și dorește să
//integreze sistemul informatic al farmaciei cu sistemul software existent în micul magazin de
//medicamente. Dezvoltatorii farmaciei trebuie să integreze aceste două aplicații, astfel încât
//aplicația farmaciei să poate folosi obiectele de tip Medicament din aplicația spitalului. Clasa
//Medicament din aplicația spitalului are metodele achizitioneazaMedicament() și prezintaReteta().
//Metoda prezintaReteta() este apelată din achizitioneazaMedicament() pentru verificarea rețetei.
//Clasa Medicament din aplicația farmaciei are o singură metodă cumpărăMedicament() în care nu
//se face verificarea rețetei, deoarece farmacia o să vândă medicamente și fără rețetă.

import clase.AdapterMedicamentSpital;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {

    public static void farmacieStoc(MedicamentFarmacie medicament){
        System.out.println(" Farmacia detine medicamentul: " + medicament.getNume());
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {

        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Paduden",15);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Coldrex",45);
        farmacieStoc(medicamentFarmacie1);
        farmacieStoc(medicamentFarmacie2);

        MedicamentSpital medicamentSpital1 = new MedicamentSpital("Nurofen",35,true);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("ACC",67,true);

        // nu putem folosi direct obiectul spital
//        farmacieStoc(medicamentSpital);

        AdapterMedicamentSpital medicament1 = new AdapterMedicamentSpital(medicamentSpital1);
        AdapterMedicamentSpital medicament2 = new AdapterMedicamentSpital(medicamentSpital2);
        farmacieStoc(medicament1);
        farmacieStoc(medicament2);


    }
}