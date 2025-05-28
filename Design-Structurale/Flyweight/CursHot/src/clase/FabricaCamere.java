package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaCamere {
    private Map<Integer,ICamera> camere;

    public FabricaCamere() {
        this.camere = new HashMap<Integer, ICamera>();
    }

    public int getNrCamere(){
        return camere.size();
    }

    public ICamera getCamera(int cheie){
        ICamera camera = camere.get(cheie);
        if(camera == null){
            camera = new Camera(cheie,3,6,7,7);
            camere.put(cheie,camera);
        }
        return camera;
    }
}
