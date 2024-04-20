package com.java17.study08.optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record Product(long id, String name, BigDecimal price) {

    private static final String[] PRODUCT_NAMES = {
            "T-shirt", "Jeans", "Sneakers", "Backpack", "Watch",
            "Headphones", "Smartphone", "Laptop", "Camera", "Gaming Console",
            "Coffee Maker", "Fitness Tracker", "Bluetooth Speaker", "Portable Charger",
            "E-book Reader"
    };

    public static List<Product> generateRandomProducts() {
        List<Product> productList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            long id = i + 1; // Assuming product IDs start from 1
            String name = PRODUCT_NAMES[random.nextInt(PRODUCT_NAMES.length)];
            BigDecimal price = BigDecimal.valueOf(random.nextDouble() * 100); // Random price between 0 and 100
            productList.add(new Product(id, name, price));
        }
        return productList;
    }
}
