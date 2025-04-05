package clase;

public class AdapterSoftBar extends SoftBucatarie {
    SoftBar softBar;

    public AdapterSoftBar(String mancareComandata, double total) {
        super(mancareComandata, total);

    }

    public AdapterSoftBar(SoftBar softBar){
        super(softBar.getBauturiComandate(),softBar.getTotalBauturi());
        this.softBar = softBar;
    }

    @Override
    public void printeazaNotaBucatarie() {
        softBar.printeazaNotaBauturi();
    }
}
