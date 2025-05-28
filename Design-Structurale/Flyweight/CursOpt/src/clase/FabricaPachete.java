package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaPachete {
    private Map<Integer,IPachetTuristic> pachete;

    public FabricaPachete() {
        pachete = new HashMap<Integer, IPachetTuristic>();
    }

    public int genNumarPachete(){
        return pachete.size();
    }

    public IPachetTuristic getPachet(int cheie){
        //daca pachetul nu exista, il creeem noi
        IPachetTuristic pachetTuristic = pachete.get(cheie);
        if(pachetTuristic == null){
            pachetTuristic = new PachetTuristic("hotel","destinatie",true,cheie);
            pachete.put(cheie,pachetTuristic);
        }
        return pachetTuristic;
    }
}
