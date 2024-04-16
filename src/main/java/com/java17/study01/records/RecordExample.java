package com.java17.study01.records;

public class RecordExample {

    public static void main(String[] args) {
        var product = new ProductRec(1000L,"Apples","Tasty Red Apples");

        var productId = product.id();
        var productName = product.name();
        System.out.printf("Product %d has name: %s%n", productId, productName);
    }
}
