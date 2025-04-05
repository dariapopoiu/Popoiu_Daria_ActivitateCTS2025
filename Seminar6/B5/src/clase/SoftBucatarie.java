package clase;

public class SoftBucatarie {
    private String mancareComandata;
    private double totalMancare;

    public SoftBucatarie(String mancareComandata, double total) {
        this.mancareComandata = mancareComandata;
        this.totalMancare = total;
    }

    public String getMancareComandata() {
        return mancareComandata;
    }

    public double getTotalMancare() {
        return totalMancare;
    }

    public void printeazaNotaBucatarie(){
        System.out.println("S-a comandat : " + this.mancareComandata + " total " + this.totalMancare);
    }
}
