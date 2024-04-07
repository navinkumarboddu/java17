package org.java9;

import org.java9.flatmapping.Restaurant;
import org.java9.flatmapping.RestaurantUtil;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsUnmodifiableList {

    public static void beforeTopRatedRestaurants(List<Restaurant> restaurants){
        List<String> topRatedRestaurants =
                restaurants.stream()
                        .filter(restaurant -> restaurant.getRating() >= 4.5)
                        .map(Restaurant::getName)
                        .collect(Collectors.toList());

        topRatedRestaurants.add("Pirate Bar");

        System.out.println("Top rated restaurants: " + topRatedRestaurants);
    }

    public static void afterTopRatedRestaurants(List<Restaurant> restaurants){
        List<String> topRatedRestaurants =
                restaurants.stream()
                        .filter(restaurant -> restaurant.getRating() >= 4.5)
                        .map(Restaurant::getName)
                        .collect(Collectors.toUnmodifiableList());

        /*
        topRatedRestaurants.add("Pirate Bar");
        --- Exception in thread "main" java.lang.UnsupportedOperationException
	        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
         */

        System.out.println("Top rated restaurants: " + topRatedRestaurants);
    }


    public static void main(String[] args) {
        List<Restaurant> restaurants = RestaurantUtil.createRestaurants();
        System.out.println("Before Unmodifiable TopRatedRestaurants::::");
        beforeTopRatedRestaurants(restaurants);

        System.out.println("After Unmodifiable TopRatedRestaurants::::");
        afterTopRatedRestaurants(restaurants);
    }
}

