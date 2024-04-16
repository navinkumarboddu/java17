package com.java17.study01.records.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.java17.study01.records.Validation.checkThat;

public record Order(Long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    /**
     * canonical constructor
     *
     * @param id
     * @param customer
     * @param dateTime
     * @param lines
    public Order(Long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {
        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null && !lines.isEmpty(), "customer must not be null");

        this.id = id;
        this.customer = customer;
        this.dateTime = dateTime;
        this.lines = List.copyOf(lines); //defensive unmodifiable copy
    }*/

    //Rules:
    // - canonical constructor's access level cannot be more restrictive than that of the record itself
    // - canonical constructor cannot have a 'throws' clause means Checked Exception cannot be thrown
    // - canonical constructor's are used to validate the records and make defensive copies

    /*
     * Compact constructor
     */
    public Order {
        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null && !lines.isEmpty(), "customer must not be null");

        lines = List.copyOf(lines);
    }

    public static Order createOrderAtCurrentDateTime(long id, Customer customer, List<OrderLine> lines){
        return new Order(id, customer, LocalDateTime.now(), lines);
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private long id;
        private Customer customer;
        private LocalDateTime localDateTime;
        private List<OrderLine> lines = new ArrayList<>();

        public Builder withId(long id){
            this.id = id;
            return this;
        }

        public  Builder forCustomer(Customer customer){
            this.customer = customer;
            return this;
        }

        public Builder atDateTime(LocalDateTime dateTime){
            this.localDateTime = dateTime;
            return this;
        }

        public Builder addLine(OrderLine line){
            this.lines.add(line);
            return this;
        }

        public Order build(){
            return new Order(id, customer, localDateTime, lines);
        }
    }
}
