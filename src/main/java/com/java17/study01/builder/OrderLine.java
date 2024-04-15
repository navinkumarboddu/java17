package com.java17.study01.builder;

import java.math.BigDecimal;

public record OrderLine(ProductRec productRec, int quality, BigDecimal price) {
}
