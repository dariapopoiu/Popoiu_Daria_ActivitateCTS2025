package ro.cts.clase.factory;

public class WarningReport implements FieldReport {
    private String data;
    private String dateWarning;

    public WarningReport(String data, String dateAlerta) {
        this.data = data;
        this.dateWarning= dateAlerta;
    }

    @Override
    public void creeazaRaport() {
        System.out.println("ALERTA:"+ this.dateWarning+ " la data "+ this.data);
    }
}
