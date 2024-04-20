package com.java17.study08.optional;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

public class OptionalExample02 {

    public static void main(String[] args) {
        Optional<Product> optional = findProductById(16L);

        optional.ifPresent(p -> System.out.println("Found Product:" + p));

        optional.ifPresentOrElse(
                p -> System.out.println("Found product : " + p),
                () -> System.out.println("Product not found...")
        );

        String text = optional.map(Product::name).orElse("Product not found...");
        System.out.println(text);

        Set<Long> discountedProductIds = Set.of(3L, 5L, 9L ,12L);
        System.out.println(optional
                .filter(p -> discountedProductIds.contains(p.id()))
                .map(p -> "Discounted product: " + p.name())
                .orElse("No discounted prodcut"));


    }

    private static Optional<Product> findProductById(long productId){
        return Product.generateRandomProducts().stream().filter(p -> p.id() == productId).findFirst();
    }
}
