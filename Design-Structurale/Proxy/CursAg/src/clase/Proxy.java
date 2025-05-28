package clase;

public class Proxy implements PachetTuristic{
    private PachetTransport pachetTransport;

    public Proxy(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    @Override
    public void descriePachet() {
        pachetTransport.descriePachet();
    }

    @Override
    public void rezervaPachet() {
        if(pachetTransport.getPersoana().getVarsta()< 65)
            System.out.println("Nu se poate rezerva pachetul");
        else{
            pachetTransport.rezervaPachet();
        }
    }
}
