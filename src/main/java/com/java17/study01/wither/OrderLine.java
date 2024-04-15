package com.java17.study01.wither;

import com.java17.study01.ProductRec;

import java.math.BigDecimal;

public record OrderLine(ProductRec productRec, int quantity, BigDecimal price) {

    public OrderLine withQuantity( int newQuantity){
        return new OrderLine(this.productRec, newQuantity, this.price);
    }

    public OrderLine withPrice(BigDecimal newPrice){
        return new OrderLine(this.productRec, this.quantity, newPrice);
    }
}
