package main;

//A.3. În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic,
//Secretar, Registrator. Să se implementeze modulul care pune la dispoziției crearea de obiecte din
//familia obiectelor PersonalSpital stiind faptul ca personalul este împărțit in doua categorii:
//personal medical si personal non-Medical.

import clase.Angajat;
import clase.Asistent;
import clase.Medic;
import clase.Secretar;
import factories.FactoryPersonalMedical;
import factories.FactoryPersonalNonMedical;

import static factories.TipPersonalMedical.ASISTENT;
import static factories.TipPersonalMedical.MEDIC;
import static factories.TipPersonalNonMedical.PORTAR;
import static factories.TipPersonalNonMedical.SECRETAR;

public class Main {
    public static void main(String[] args) {

        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(0.4);
        Angajat medic1 = factoryPersonalMedical.cloneAngajat(MEDIC,"Dora",30000);
        System.out.println(medic1);

        Angajat medic2 = factoryPersonalMedical.cloneAngajat(MEDIC,"Maria",10000);
        System.out.println(medic2);

        factoryPersonalMedical.setSpor(0.6);
        Angajat medic3 = factoryPersonalMedical.cloneAngajat(ASISTENT,"Lali",1300);
        System.out.println(medic3);

        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(10);
        Angajat secretar1 = factoryPersonalNonMedical.cloneAngajat(SECRETAR,"Diana",4000);
        factoryPersonalNonMedical.setVechime(30);
        Angajat portar = factoryPersonalNonMedical.cloneAngajat(PORTAR,"Coco",2600);
        System.out.println(secretar1.toString());
        System.out.println(portar.toString());





    }
}