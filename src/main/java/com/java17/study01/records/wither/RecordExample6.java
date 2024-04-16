package com.java17.study01.records.wither;

import com.java17.study01.records.ProductRec;

import java.math.BigDecimal;

public class RecordExample6 {

    public static void main(String[] args) {
        var product = new ProductRec(1001L, "Apples", "Tasty red apples");

        var line = new OrderLine(product, 6, new BigDecimal("5.94"));

        var newLine1 = line.withQuantity(10).withPrice(new BigDecimal("4.50"));

        System.out.println(newLine1);
    }
}
