package org.java9.flatmapping;

import java.util.List;

public class Restaurant {

    private final String name;

    private double rating;

    private List<Item> items;

    private Cuisine cuisine;


    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", items=" + items +
                ", cuisine=" + cuisine +
                '}';
    }
}
