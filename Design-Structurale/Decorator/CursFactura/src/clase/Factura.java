package clase;

public class Factura implements IFactura{
    private int codFacturare;
    private double suma;

    public Factura(int codFacturare, double suma) {
        this.codFacturare = codFacturare;
        this.suma = suma;
    }

    public int getCodFacturare() {
        return codFacturare;
    }

    public void setCodFacturare(int codFacturare) {
        this.codFacturare = codFacturare;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("COD FACTURA: "+this.codFacturare+"; Suma de plata: "+this.suma);
    }
}
