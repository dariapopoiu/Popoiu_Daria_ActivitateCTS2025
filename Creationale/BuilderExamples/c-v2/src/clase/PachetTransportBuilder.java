package clase;

public class PachetTransportBuilder extends Builder{
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransportBuilder() {
        this.hasAC = false;
        this.hasAnimale = false;
        this.isFumator = false;
        this.hasTV = false;
        this.hasWifi = false;
    }

    public PachetTransportBuilder setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    public PachetTransportBuilder setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
        return this;
    }

    public PachetTransportBuilder setFumator(boolean fumator) {
        isFumator = fumator;
        return this;
    }

    public PachetTransportBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public PachetTransportBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(hasWifi,hasAnimale,isFumator,hasAC,hasTV);
    }
}
