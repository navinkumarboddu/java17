package org.java9;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MapFactoryMethodsPracticeTest {

    @Test
    void getStockData(){
        assertThrows(UnsupportedOperationException.class, () -> {
            Map<String, BigDecimal> stockData = MapFactoryMethodsPractice.getStockData();
            stockData.remove("GOOG");
        });
    }

    @Test
    void testStockSymbolsUsingFactoryMethods(){
        assertThrows(UnsupportedOperationException.class, () -> {
            Map<String, BigDecimal> stockData = MapFactoryMethodsPractice.getStockDatasUsingFactoryMethods();
            stockData.remove("GOOG");
        });
    }

}
