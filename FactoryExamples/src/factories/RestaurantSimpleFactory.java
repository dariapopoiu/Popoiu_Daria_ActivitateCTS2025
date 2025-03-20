package factories;

import classes.*;

public class RestaurantSimpleFactory {

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
