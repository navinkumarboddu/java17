package org.java9.flatmapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RestaurantCollector {

    public static List<Restaurant> getRestaurants(){
        List<Restaurant> restaurants = new ArrayList<>();

        Restaurant restaurant1 = new Restaurant("Kesar Da Dhaba");
        restaurant1.setCuisine(Cuisine.INDIAN);
        List<Item> items1 = List.of(new Item("Dosa",200),
                new Item("Misal", 250));
        restaurant1.setItems(items1);
        restaurants.add(restaurant1);

        Restaurant restaurant2 = new Restaurant("Finix");
        restaurant2.setCuisine(Cuisine.BAKERY);
        List<Item> items2 = List.of(new Item("Cake", 250),
                new Item("Khaari", 50));
        restaurant2.setItems(items2);
        restaurants.add(restaurant2);

        Restaurant restaurant3 = new Restaurant("Desi Dhaba");
        restaurant3.setCuisine(Cuisine.INDIAN);
        List<Item> items3 = List.of(new Item("Ghee Roti",20),
                new Item("Paneer Sabji", 250));
        restaurant3.setItems(items3);
        restaurants.add(restaurant3);

        return restaurants;
    }

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

    public static void main(String[] args) {
        List<Restaurant> restaurants = RestaurantCollector.getRestaurants();
        beforeDownStreamFlatMapping(restaurants);
        afterDownStreamFlatMapping(restaurants);
    }
}
