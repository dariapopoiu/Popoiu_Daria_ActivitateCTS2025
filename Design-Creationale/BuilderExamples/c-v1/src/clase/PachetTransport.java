package clase;

public class PachetTransport {
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransport(boolean hasWifi, boolean hasAnimale, boolean isFumator, boolean hasAC, boolean hasTV) {
        this.hasWifi = hasWifi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public PachetTransport() {
        this.hasWifi = false;
        this.hasAnimale = false;
        this.isFumator = false;
        this.hasAC = false;
        this.hasTV = false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("hasWifi=").append(hasWifi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }
}
