package clase;

public class FacturaDecorata extends Decorator{
    public FacturaDecorata(Factura factura) {
        super(factura);
    }

    @Override
    public void aplicaDiscount(int procent) {
        super.factura.setSuma(factura.getSuma()-(((double) procent /100)*factura.getSuma()));
    }
}
