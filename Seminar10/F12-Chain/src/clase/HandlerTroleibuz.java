package clase;

public class HandlerTroleibuz extends Handler{

    @Override
    public void parcurgeDrum(int distanta) {
        if( distanta <= 3 ){
            System.out.println("Am ales Troleibuz");
        }
        else if( super.getUrmator() != null){
            super.getUrmator().parcurgeDrum(distanta);
        }
    }
}
