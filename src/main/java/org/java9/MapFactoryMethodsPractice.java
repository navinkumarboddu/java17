package org.java9;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapFactoryMethodsPractice {

    public static Map<String, BigDecimal> getStockData() {
        Map<String, BigDecimal> stockData = new HashMap<>();

        stockData.put("AAPL", BigDecimal.valueOf(179.68));
        stockData.put("GOOG", BigDecimal.valueOf(2880.94));
        stockData.put("AMZN", BigDecimal.valueOf(3339.51));

        return Collections.unmodifiableMap(stockData);
    }

    //consise unmodifiable Map creation using Map Factory Methods
    public static Map<String, BigDecimal> getStockDatasUsingFactoryMethods(){
        return Map.of("AAPL", BigDecimal.valueOf(179.68),
                "GOOG", BigDecimal.valueOf(2880.94),
                "AMZN", BigDecimal.valueOf(3339.51));
    }
}
