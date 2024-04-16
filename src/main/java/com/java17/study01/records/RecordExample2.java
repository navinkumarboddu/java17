package com.java17.study01.records;

public class RecordExample2 {

    public static void main(String[] args) {
        var customer = new Customer(1001L,null,null);
        System.out.println(customer.name());

        var customerCopy = new Customer((customer.id()), customer.name(), customer.email());
        System.out.println(customerCopy.equals(customer));

        System.out.println(customer);
        System.out.println(customerCopy);
    }
}
