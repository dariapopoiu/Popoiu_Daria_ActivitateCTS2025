package clase;

public class SoftBar {
    private String bauturiComandate;
    private double totalBauturi;

    public SoftBar(String bauturiComandate, double totalBauturi) {
        this.bauturiComandate = bauturiComandate;
        this.totalBauturi = totalBauturi;
    }

    public String getBauturiComandate() {
        return bauturiComandate;
    }

    public double getTotalBauturi() {
        return totalBauturi;
    }

    public void printeazaNotaBauturi(){
        System.out.println("S-a comandat: "+ this.bauturiComandate + "total: "+ this.totalBauturi);
    }
}
