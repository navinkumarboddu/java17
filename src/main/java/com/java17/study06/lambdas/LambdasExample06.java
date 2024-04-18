package com.java17.study06.lambdas;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LambdasExample06 {

    public static void main(String[] args) {
        var products = List.of(
                new Product(1001L, "Apples", new BigDecimal("2.25")),
                new Product(1002L, "Oranges",new BigDecimal("4.09")),
                new Product(1003L, "Cheese",new BigDecimal("6.69")),
                new Product(1004L, "Bread",new BigDecimal("3.49"))
        );

        var expensiveProducts = products.stream().filter(LambdasExample06::isExpensive).toList();
        expensiveProducts.forEach(System.out::println);

        var totalPrice = products.stream().map(Product::price).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total Price : "  + totalPrice);

        var productNames = products.stream().map(Product::name).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(productNames);
    }

    static boolean isExpensive(Product product){
        return product.price().compareTo(new BigDecimal("4.00")) >= 0;
    }
}

record Product(long id, String name, BigDecimal price){}