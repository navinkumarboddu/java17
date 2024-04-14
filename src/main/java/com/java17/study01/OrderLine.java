package com.java17.study01;

import java.math.BigDecimal;

public record OrderLine(ProductRec productRec, int quality, BigDecimal price) {
}
