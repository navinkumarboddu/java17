package com.java17.study01.records;

import java.math.BigDecimal;

public record OrderLine(ProductRec productRec, int quality, BigDecimal price) {
}
