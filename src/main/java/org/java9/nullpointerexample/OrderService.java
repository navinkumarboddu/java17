package org.java9.nullpointerexample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OrderService {

    public static void main(String[] args) throws IOException {
       Order order = getOrderDetails();

       System.out.println("Zip code : " + order.getBuyer().getAddress().getZip());
       /* Helpful NullPointerException is started from Java 15
       Exception in thread "main" java.lang.NullPointerException:
       Cannot invoke "org.java9.nullpointerexample.Address.getZip()" because the return value of "org.java9.nullpointerexample.Buyer.getAddress()" is null
	    at org.java9.nullpointerexample.OrderService.main(OrderService.java:14)
        */
    }

    private static Order getOrderDetails() throws IOException {
       var path = Path.of("src/main/resources/order.json");
        var objectMapper = new ObjectMapper();

        return objectMapper.readValue(Files.readString(path), Order.class);
    }
}
