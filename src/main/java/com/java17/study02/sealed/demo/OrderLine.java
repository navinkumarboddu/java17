package com.java17.study02.sealed.demo;

public sealed interface OrderLine permits SaleOrderLine, DiscountOrderLine {
}
