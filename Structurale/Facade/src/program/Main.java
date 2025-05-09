package program;

import clase.Facade;

//Pentru realizarea rezervărilor pachetelor turistice un operator trebuie **să
//creeze** pachetul turistic ideal pentru client. Apoi trebuie **să rezerve**
//cazarea la hotelul dorit,** să caute** zboruri pentru clienți și **să salveze noul
//pachet rezervat.**
//  Să se realizeze un modul care să ***simplifice** procesul de rezervare pentru
//operator
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.rezervaPachet("Galati","Bucuresti");
    }
}