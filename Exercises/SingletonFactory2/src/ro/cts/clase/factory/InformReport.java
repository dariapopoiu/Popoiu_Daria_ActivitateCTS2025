package ro.cts.clase.factory;

public class InformReport implements FieldReport {
    private String data;
    private String dateInfo;

    public InformReport(String data, String dateInfo) {
        this.data = data;
        this.dateInfo = dateInfo;
    }

    @Override
    public void creeazaRaport() {
        System.out.println("ALERTA:"+ this.dateInfo + " la data "+ this.data);
    }
}
