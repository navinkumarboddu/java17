package com.java17.study08.optional;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

public class OptionalExample01 {

    private static  final Random RANDOM = new Random();
    public static void main(String[] args) {
        Optional<Product> optional = findProductById(13L);

        Optional<Product> optional2 = Optional.ofNullable(getProductById(16L));

        if(optional.isPresent()){
            Product product = optional.get();
            System.out.println("Found Product: " + product);
        } else {
            System.out.println("Product not found...");
        }

        Product product1 = optional2.orElse(new Product(16L, "Milk", new BigDecimal("1.39")));
        System.out.println("Product: " + product1);

        Product product2 = optional.orElseGet(() -> Product.generateRandomProducts().get(RANDOM.nextInt(Product.generateRandomProducts().size())));
        System.out.println(product2);
    }

    private  static Product getProductById(long productId){
        for(Product product: Product.generateRandomProducts()){
            if(product.id() == productId){
                return product;
            }
        }
        return null;
    }

    private  static Optional<Product> findProductById(long productId){
        for(Product product: Product.generateRandomProducts()){
            if(product.id() == productId){
                return  Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
