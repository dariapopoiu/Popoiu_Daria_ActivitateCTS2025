package clase;

public class Hotel {
    private int nrCamera;
    private String oras;

    public Hotel(int nrCamera, String oras) {
        this.nrCamera = nrCamera;
        this.oras = oras;
    }

    protected void rezervaCamera(){
        System.out.println("S-a rezervat camera la hotel in "+this.oras+" , camera "+this.nrCamera);
    }
}
