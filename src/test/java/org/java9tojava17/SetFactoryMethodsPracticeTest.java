package org.java9tojava17;

import org.java9tojava17.SetFactoryMethodsPractice;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SetFactoryMethodsPracticeTest {

    @Test
    void testGetStockSymbols(){
        assertThrows(UnsupportedOperationException.class, () -> {
            Set<String> stocks = SetFactoryMethodsPractice.getStockSymbolsUsingFactoryMethods();
            stocks.add("NVDA");
        });
    }

}
