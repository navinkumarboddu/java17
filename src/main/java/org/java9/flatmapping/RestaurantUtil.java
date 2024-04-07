package org.java9.flatmapping;

import java.util.ArrayList;
import java.util.List;

public class RestaurantUtil {

    public static List<Restaurant> createRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();

        // Indian Cuisine
        Restaurant restaurant1 = new Restaurant("Kesar Da Dhaba");
        restaurant1.setCuisine(Cuisine.INDIAN);
        List<Item> items1 = List.of(new Item("Dosa", 200),
                new Item("Misal", 250));
        restaurant1.setItems(items1);
        restaurant1.setRating(4);
        restaurants.add(restaurant1);

        // Bakery Cuisine
        Restaurant restaurant2 = new Restaurant("Finix");
        restaurant2.setCuisine(Cuisine.BAKERY);
        List<Item> items2 = List.of(new Item("Cake", 250),
                new Item("Khaari", 50));
        restaurant2.setItems(items2);
        restaurant2.setRating(4.5);
        restaurants.add(restaurant2);

        // Indian Cuisine
        Restaurant restaurant3 = new Restaurant("Desi Dhaba");
        restaurant3.setCuisine(Cuisine.INDIAN);
        List<Item> items3 = List.of(new Item("Ghee Roti", 20),
                new Item("Paneer Sabji", 250));
        restaurant3.setItems(items3);
        restaurant3.setRating(4.7);
        restaurants.add(restaurant3);

        // Chinese Cuisine
        Restaurant restaurant4 = new Restaurant("Dragon House");
        restaurant4.setCuisine(Cuisine.CHINESE);
        List<Item> items4 = List.of(new Item("Chow Mein", 180),
                new Item("Spring Rolls", 150));
        restaurant4.setItems(items4);
        restaurant4.setRating(4.2);
        restaurants.add(restaurant4);

        // Continental Cuisine
        Restaurant restaurant5 = new Restaurant("Gourmet Junction");
        restaurant5.setCuisine(Cuisine.CONTINENTAL);
        List<Item> items5 = List.of(new Item("Grilled Chicken", 300),
                new Item("Pasta", 220));
        restaurant5.setItems(items5);
        restaurant5.setRating(4.8);
        restaurants.add(restaurant5);

        // Italian Cuisine
        Restaurant restaurant6 = new Restaurant("Bella Italia");
        restaurant6.setCuisine(Cuisine.ITALIAN);
        List<Item> items6 = List.of(new Item("Margherita Pizza", 280),
                new Item("Ravioli", 320));
        restaurant6.setItems(items6);
        restaurant6.setRating(4.6);
        restaurants.add(restaurant6);

        // Bakery Cuisine
        Restaurant restaurant7 = new Restaurant("Sweet Treats");
        restaurant7.setCuisine(Cuisine.BAKERY);
        List<Item> items7 = List.of(new Item("Croissant", 80),
                new Item("Cupcake", 120));
        restaurant7.setItems(items7);
        restaurant7.setRating(4.3);
        restaurants.add(restaurant7);

        // Indian Cuisine
        Restaurant restaurant8 = new Restaurant("Pind Punjabi Dhaba");
        restaurant8.setCuisine(Cuisine.INDIAN);
        List<Item> items8 = List.of(new Item("Butter Chicken", 300),
                new Item("Naan", 50));
        restaurant8.setItems(items8);
        restaurant8.setRating(4.4);
        restaurants.add(restaurant8);

        // Chinese Cuisine
        Restaurant restaurant9 = new Restaurant("Golden Dragon");
        restaurant9.setCuisine(Cuisine.CHINESE);
        List<Item> items9 = List.of(new Item("Sweet and Sour Chicken", 220),
                new Item("Fried Rice", 180));
        restaurant9.setItems(items9);
        restaurant9.setRating(4.0);
        restaurants.add(restaurant9);

        // Italian Cuisine
        Restaurant restaurant10 = new Restaurant("Trattoria");
        restaurant10.setCuisine(Cuisine.ITALIAN);
        List<Item> items10 = List.of(new Item("Tiramisu", 180),
                new Item("Lasagna", 320));
        restaurant10.setItems(items10);
        restaurant10.setRating(4.9);
        restaurants.add(restaurant10);

        return restaurants;
    }
}
