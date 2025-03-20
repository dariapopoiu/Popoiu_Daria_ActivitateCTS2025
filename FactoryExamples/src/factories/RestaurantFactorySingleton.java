package factories;

import classes.*;

public class RestaurantFactorySingleton {
    String name;

    private static RestaurantFactorySingleton instance = null;

    private RestaurantFactorySingleton(){

    }

    public static synchronized RestaurantFactorySingleton getInstance(){

        if(instance == null){
            instance= new RestaurantFactorySingleton();
        }
        return instance;
    }

    public Restaurant createRestaurant(TipRestaurant tip) throws Exception {
        switch (tip) {
            case restaurantDineIn:
                return new RestaurantDineIn();
            case restaurantDineOut:
                return new RestaurantDineOut();
            case restaurantDineInAndOut:
                return new RestaurantDineInAndOut();
            default:
                throw new Exception("tipul primit nu este gasit");
        }
    }
}
