package com.java17.study02.sealed.demo;

import java.math.BigDecimal;

public class OrderService {

    public BigDecimal calculateTotalAmount(Order order){
        var total = BigDecimal.ZERO;

        for(OrderLine line: order.lines()){
            if(line instanceof  SaleOrderLine sale){
                total = total.add(sale.price());
            } else if(line instanceof  DiscountOrderLine discount){
                total = total.subtract(discount.amount());
            }
        }
        return total;
    }
}
