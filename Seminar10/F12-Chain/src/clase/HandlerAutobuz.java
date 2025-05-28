package clase;

public class HandlerAutobuz extends Handler{
    public HandlerAutobuz() {
        super();
    }

    @Override
    public void parcurgeDrum(int distanta) {
        if( distanta <= 5 ){
            System.out.println("Am ales Autobuz");
        }
        else if( super.getUrmator() != null){
            super.getUrmator().parcurgeDrum(distanta);
        }
    }
}
