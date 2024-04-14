package com.java17.study01;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RecordExample3 {

    public static void main(String[] args) {
        var customer = new Customer(1000L, "Navin", "navin@xyz.abc");
        System.out.println(customer);

        var product1 = new ProductRec(10001L, "Apples", "Tasty red apples");
        var product2 = new ProductRec(10002L, "Bread", "Whole-wheat Loaf");

        var lines = new ArrayList<OrderLine>();
        lines.add(new OrderLine(product1, 6, new BigDecimal("5.94")));
        lines.add(new OrderLine(product2, 2, new BigDecimal("2.50")));

        var order = new Order(20002L, customer, LocalDateTime.now(), lines);

        var orderLine = new OrderLine(new ProductRec(10003L,"Bananas", "Yellow Bananas"), 1, new BigDecimal("0.99"));
        order.lines().add(orderLine);

        System.out.println(order);
    }
}
