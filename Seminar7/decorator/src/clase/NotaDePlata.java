package clase;

public class NotaDePlata implements Nota{

    private float total;

    public NotaDePlata(float total){
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public NotaDePlata setTotal(float total) {
        this.total = total;
        return this;
    }

    @Override
    public void printare() {
        System.out.println("total nota:" + total);
    }
}
