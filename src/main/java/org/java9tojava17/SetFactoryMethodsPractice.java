package org.java9tojava17;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetFactoryMethodsPractice {

    private SetFactoryMethodsPractice() {
    }

    public static Set<String> getStockSymbols(){
        Set<String> stockSymbols = new HashSet<>();

        stockSymbols.add("AAPL");
        stockSymbols.add("GOOG");
        stockSymbols.add("AMZN");

        return Collections.unmodifiableSet(stockSymbols);
    }

    //consise unmodifiable Set creation using Set Factory Methods
    public static Set<String> getStockSymbolsUsingFactoryMethods(){
        return Set.of("AAPL","GOOG","AMZN");
    }
}
