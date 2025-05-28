package clase;

public class PachetTransportBuilder extends Builder {
    PachetTransport pachetTransport;

    public PachetTransportBuilder(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    public PachetTransportBuilder(){
        this.pachetTransport = new PachetTransport(false,false,false,false,false);
    }

    public PachetTransportBuilder setHasWifi(boolean hasWifi) {
        this.pachetTransport.setHasWifi(hasWifi);
        return this;
    }

    public PachetTransportBuilder setHasAC(boolean hasAC) {
        this.pachetTransport.setHasAC(hasAC);
        return this;
    }

    public PachetTransportBuilder setHasAnimale(boolean hasAnimale) {
        this.pachetTransport.setHasAnimale(hasAnimale);
        return this;
    }

    public PachetTransportBuilder setIsFumator(boolean isFumator) {
        this.pachetTransport.setFumator(isFumator);
        return this;
    }
    public PachetTransportBuilder setHasTv(boolean hasTv){
        this.pachetTransport.setHasTV(hasTv);
        return this;
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }
}
