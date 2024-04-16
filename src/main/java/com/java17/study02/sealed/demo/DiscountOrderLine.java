package com.java17.study02.sealed.demo;

import java.math.BigDecimal;

public record DiscountOrderLine(String discountCode, BigDecimal amount) implements OrderLine {
}
