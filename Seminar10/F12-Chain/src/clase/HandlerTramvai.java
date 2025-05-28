package clase;

public class HandlerTramvai extends Handler{

    @Override
    public void parcurgeDrum(int distanta) {
        if( distanta <= 10 ){
            System.out.println("Am ales Tramvai");
        }
        else if( super.getUrmator() != null){
            super.getUrmator().parcurgeDrum(distanta);
        }
    }
}
