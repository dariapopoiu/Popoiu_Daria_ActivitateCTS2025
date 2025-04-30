package ro.cts.clase.factory;

public class AlertReport implements FieldReport {
    private String data;
    private String dateAlerta;

    public AlertReport(String data, String dateAlerta) {
        this.data = data;
        this.dateAlerta = dateAlerta;
    }

    @Override
    public void creeazaRaport() {
        System.out.println("ALERTA:"+ this.dateAlerta + " la data "+ this.data);
    }
}
