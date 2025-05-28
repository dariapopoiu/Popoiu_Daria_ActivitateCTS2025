package main;

import classes.Restaurant;
import classes.TipRestaurant;
import factories.RestaurantFactorySingleton;
import factories.RestaurantSimpleFactory;

public class Main {
    public static void main(String[] args) {

        RestaurantSimpleFactory factory=new RestaurantSimpleFactory();
        Restaurant restaurant = null;

        try{
            restaurant=factory.createRestaurant(TipRestaurant.restaurantDineIn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        restaurant.descriere();

        Restaurant restaurant2 = null;

        RestaurantFactorySingleton factorySingleton = RestaurantFactorySingleton.getInstance();
        try {
            restaurant2 = factorySingleton.createRestaurant(TipRestaurant.restaurantDineInAndOut);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        restaurant2.descriere();

    }
}