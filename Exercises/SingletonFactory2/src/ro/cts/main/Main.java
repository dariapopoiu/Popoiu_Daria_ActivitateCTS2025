package ro.cts.main;

import ro.cts.clase.factory.*;
import ro.cts.clase.singleton.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ConexiuneControl conexiuneBazaControl = ConexiuneControl.getInstanta("baza de control1");
        ConexiuneGPS conexiuneGPS = ConexiuneGPS.getInstanta("gps1");
        ConexiuneWeb conexiuneWeb = ConexiuneWeb.getInstanta("web1");

        conexiuneBazaControl.descrieConexiune();

        ServiceConnection conexiuneControl2 = ConexiuneControl.getInstanta("baza de control2");

        conexiuneControl2.descrieConexiune();

        try {
            RegistryConexiune.addConnection("gps", conexiuneGPS);
            RegistryConexiune.addConnection("web", conexiuneWeb);
            RegistryConexiune.addConnection("control", conexiuneWeb);
            RegistryConexiune.addConnection("control", conexiuneWeb);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------");
        RegistryConexiune.getConnection("gps").descrieConexiune();

        AbstractFactory factory = new FactoryReport();
        FieldReport warningReport = factory.getReport(ReportType.WARNING,"21/10/2003"," warningg");

        warningReport.creeazaRaport();

        FieldReport alertReport = factory.getReport(ReportType.ALERT,"03/03/2022","alert");
        FieldReport infoReport = factory.getReport(ReportType.INFO,"03/03/2022","info");

        alertReport.creeazaRaport();
        infoReport.creeazaRaport();

        FieldReport alertReport2 = factory.getReport(ReportType.ALERT,"13/03/2005","alertaa");
        alertReport2.creeazaRaport();
        alertReport.creeazaRaport();
    }
}