package com.java17.study01.records.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class RecordExample5 {

    public static void main(String[] args) {
        var product1 = new ProductRec(1001L,"Apples", "Tasty Red Apples");
        var product2 = new ProductRec(1002L,"Bread", "Whole Wheat Loaf");

        var customer = new Customer(3001L,"Joe Exter","joe.exter@abc.com");

        var order1 = new Order(200201L,customer, LocalDateTime.now(), List.of(
                new OrderLine(product1, 6, new BigDecimal("5.94")),
                new OrderLine(product2, 2, new BigDecimal("2.50"))
        ));

        var order2 = Order.builder()
                .withId(200202L)
                .forCustomer(customer)
                .atDateTime(LocalDateTime.now())
                .addLine(new OrderLine(product1, 6, new BigDecimal("5.94")))
                .addLine(new OrderLine(product2, 2, new BigDecimal("2.50")))
                .build();
    }
}
