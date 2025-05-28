package clase;

public class Camera implements ICamera{
    private int nrCamera;
    private int nrUmerase;
    private int nrCerseafuri;
    private int nrPerne;
    private int nrProsoape;

    public Camera(int nrCamera, int nrUmerase, int nrCerseafuri, int nrPerne, int nrProsoape) {
        this.nrCamera = nrCamera;
        this.nrUmerase = nrUmerase;
        this.nrCerseafuri = nrCerseafuri;
        this.nrPerne = nrPerne;
        this.nrProsoape = nrProsoape;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public int getNrUmerase() {
        return nrUmerase;
    }

    public void setNrUmerase(int nrUmerase) {
        this.nrUmerase = nrUmerase;
    }

    public int getNrCerseafuri() {
        return nrCerseafuri;
    }

    public void setNrCerseafuri(int nrCerseafuri) {
        this.nrCerseafuri = nrCerseafuri;
    }

    public int getNrPerne() {
        return nrPerne;
    }

    public void setNrPerne(int nrPerne) {
        this.nrPerne = nrPerne;
    }

    public int getNrProsoape() {
        return nrProsoape;
    }

    public void setNrProsoape(int nrProsoape) {
        this.nrProsoape = nrProsoape;
    }

    @Override
    public void descrieCamera(Detaliu detaliu) {
        System.out.println("Camera nr:"+this.nrCamera+" cu "+this.nrPerne+" perne ; "+this.nrCerseafuri+
                " cerseafuri ; "+ this.nrProsoape+" prosoape ; "+this.nrUmerase+ " umerase;"+
                " NUME CLIENT "+detaliu.getNumeClient());
    }
}
