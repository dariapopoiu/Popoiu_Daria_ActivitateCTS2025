import clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void detaliiMasina(AMasina masina){
        System.out.println(" Detalii Autovehicul:" + masina.getNrInmatriculare());
        masina.afiseazaKm();
    }

    public static void main(String[] args) {
        Service serviceAuto = Service.getInstanta();
        serviceAuto.arataClient();

        Masina masina1 = new Masina("B10DAR",8000,"GL",2004);
        Masina masina2 = new Masina("BR15DAO",1000,"Golf",2010);
        Masina masina3 = new Masina("B10BLM",900,"Q10",2022);
        Masina masina4 = new Masina("B10WOW",1200,"Passat",2018);

        masina1.afiseazaKm();

        serviceAuto.setMasina(masina1);
        serviceAuto.arataClient();

        Service service2 = Service.getInstanta();
        service2.setMasina(masina2);
        serviceAuto.arataClient();

        service2.acceptaMasina(masina1);
        service2.elibereazaMasina();
        service2.acceptaMasina(masina1);
        service2.arataClient();

        System.out.println("-----------------------");

        FactoryMasina factoryMasina = new FactoryMasina("BR09DAP",7500);
        AMasina van = factoryMasina.getMasina(TipMasina.VAN,"galben");
        AMasina suv = factoryMasina.getMasina(TipMasina.SUV,"extra");
        AMasina sedan = factoryMasina.getMasina(TipMasina.SEDAN,"multe");
        AMasina van2 = factoryMasina.getMasina(TipMasina.VAN,"roz");

        detaliiMasina(van);
        detaliiMasina(van2);
        detaliiMasina(suv);
        detaliiMasina(sedan);



    }
}