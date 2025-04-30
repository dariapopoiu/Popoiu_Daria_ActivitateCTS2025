package ro.cts.clase.singleton;

import java.util.HashMap;
import java.util.Map;

public class RegistryConexiune {

    private static Map<String,ServiceConnection> collection = new HashMap<>();

    private RegistryConexiune(){

    }

    public static void addConnection( String key , ServiceConnection connection) throws Exception {
        if( collection.containsKey(key)){
            throw new Exception(" Cheia este deja existenta");
        }
        else{
            collection.put(key,connection);
        }
    }

    public static ServiceConnection getConnection(String key){
        return collection.get(key);
    }
}
