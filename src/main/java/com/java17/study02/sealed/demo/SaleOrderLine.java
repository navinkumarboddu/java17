package com.java17.study02.sealed.demo;

import java.math.BigDecimal;

public record SaleOrderLine(ProductRec productRec, int quality, BigDecimal price) implements OrderLine {
}
