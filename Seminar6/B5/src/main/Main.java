package main;

//B.5. Restaurantul achiziționează un nou soft nou pentru lucrul de la bar, însă acesta nu este
//compatibil cu softul de printare facturi folosit pentru produsele de la bucătărie. Vechiul soft era
//compatibil deoarece au fost realizate de aceeași echipa. Să se implementeze un nivel intermediar
//prin care noul soft să poată fi folosit cu softul existent, fără a se modifica codul din vreo aplicație.

import clase.AdapterSoftBar;
import clase.SoftBar;
import clase.SoftBucatarie;
import clase.SoftPrintare;

public class Main {
    public static void main(String[] args) {
        SoftPrintare softPrintare = new SoftPrintare();

        SoftBucatarie softBucatarie1 = new SoftBucatarie("pizza,paste",45);
        softPrintare.printeazaNota(softBucatarie1);

        SoftBar softBar1 = new SoftBar("capucino, cafea",20);
//        softPrintare.printeazaNota(softBar1);
        AdapterSoftBar softBar = new AdapterSoftBar(softBar1);
        softPrintare.printeazaNota(softBar);
    }
}