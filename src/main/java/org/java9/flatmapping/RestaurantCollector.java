package org.java9.flatmapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RestaurantCollector {

    /*
    * It uses Collectors.mapping to map each Restaurant to its list of items and collects them into a list.
    * As a result, it produces a Map<Cuisine, List<List<Item>>> where each cuisine maps to a list of lists of items.
    * It then iterates over this map and prints each cuisine along with the list of items associated with it.
    * This method is suitable when you want to maintain the hierarchical structure of items grouped by cuisine.
    */
    public static void beforeDownStreamFlatMapping(List<Restaurant> restaurants){
        Map<Cuisine, List<List<Item>>> itemsByCuisine = restaurants.stream()
                .collect(Collectors.groupingBy(
                        Restaurant::getCuisine,
                        Collectors.mapping(
                                rest -> rest.getItems(),
                                Collectors.toList()
                        )
                ));

        // Iterate over the entries of the map
        for (Map.Entry<Cuisine, List<List<Item>>> entry : itemsByCuisine.entrySet()) {
            Cuisine cuisine = entry.getKey();
            List<List<Item>> itemsLists = entry.getValue();

            // Print cuisine name
            System.out.println("Cuisine: " + cuisine);

            // Iterate over the list of items lists
            for (List<Item> items : itemsLists) {
                // Iterate over the items in each list
                for (Item item : items) {
                    // Print item details
                    System.out.println("  Item: " + item.getName() + ", Cost: " + item.getCost());
                }
            }
        }
    }

    /*
    * It uses Collectors.flatMapping to flatten the list of items and collects them into a single list.
    * As a result, it produces a Map<Cuisine, List<Item>> where each cuisine maps to a flat list of items.
    * It then iterates over this map and prints each cuisine along with the flattened list of items associated with it.
    * This method is suitable when you want a flattened structure where each cuisine maps directly to a list of items without any nested lists.
     */
    public static void afterDownStreamFlatMapping(List<Restaurant> restaurants) {
        Map<Cuisine, List<Item>> itemsByCuisine = restaurants.stream()
                .collect(Collectors.groupingBy(
                        Restaurant::getCuisine,
                        Collectors.flatMapping(
                                rest -> rest.getItems().stream(),
                                Collectors.toList()
                        )
                ));

        // Iterate over the entries of the map
        for (Map.Entry<Cuisine, List<Item>> entry : itemsByCuisine.entrySet()) {
            Cuisine cuisine = entry.getKey();
            List<Item> items = entry.getValue();

            // Print cuisine name
            System.out.println("Cuisine: " + cuisine);

            // Iterate over the items in the list
            for (Item item : items) {
                // Print item details
                System.out.println("  Item: " + item.getName() + ", Cost: " + item.getCost());
            }
        }
    }

    /**
     * It first filters the restaurants based on the rating condition (rest.getRating() >= 4.5).
     * After filtering, it collects the filtered restaurants into a Map with the cuisine as the key and a list of corresponding restaurants as the value.
     */
    public static void beforeDownStreamFiltering(List<Restaurant> restaurants) {
        Map<Cuisine, List<Restaurant>> byRatingFiltering = restaurants.stream()
                .filter(rest -> rest.getRating() >= 4.5)
                .collect(Collectors.groupingBy(Restaurant::getCuisine));

        byRatingFiltering.forEach( (key, value) -> System.out.println(key + "->" + value + "\n"));
    }

    /**
     * This method utilizes the Collectors.filtering() downstream collector introduced in Java 9.
     * It directly collects the restaurants into a Map using groupingBy with two parameters: the classification function (Restaurant::getCuisine) and the downstream collector (Collectors.filtering()).
     * The Collectors.filtering() collector allows us to specify an additional filtering condition (restaurant -> restaurant.getRating() >= 4.5) to be applied after grouping by cuisine.
     * This approach combines both filtering and grouping into a single collector operation, potentially making the code more concise and expressive.
     * */
    public static void afterDownStreamFiltering(List<Restaurant> restaurants) {
        Map<Cuisine, List<Restaurant>> byRatingFiltering = restaurants.stream()
                //.filter(rest -> rest.getRating() >= 4.5)
                .collect(Collectors.groupingBy(
                        Restaurant::getCuisine,
                        Collectors.filtering(
                        restaurant -> restaurant.getRating() >= 4.5,
                        Collectors.toList())
                ));

        byRatingFiltering.forEach( (key, value) -> System.out.println(key + "->" + value + "\n"));
    }

    public static void main(String[] args) {
        List<Restaurant> restaurants = RestaurantUtil.createRestaurants();
        beforeDownStreamFlatMapping(restaurants);
        afterDownStreamFlatMapping(restaurants);

        System.out.println("Filtering Example beforeDownStreamFiltering: Filter restaurants with greater than 4.5 \n");
        beforeDownStreamFiltering(restaurants);
        System.out.println("Filtering Example afterDownStreamFiltering: Filter restaurants with greater than 4.5 \n");
        afterDownStreamFiltering(restaurants);
    }
}
