package org.java9.nullpointerexample;

import java.util.List;

import java.util.List;

public class Order {
    private String customerIp;
    private String description;
    private String currency;
    private double amount;
    private List<String> products;
    private Buyer buyer;

    // Default constructor
    public Order() {
        // Empty constructor needed for Jackson deserialization
    }

    // Constructor with parameters
    public Order(String customerIp, String description, String currency, double amount, List<String> products, Buyer buyer) {
        this.customerIp = customerIp;
        this.description = description;
        this.currency = currency;
        this.amount = amount;
        this.products = products;
        this.buyer = buyer;
    }

    // Getters and setters

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}

class Buyer {
    private String email;
    private String firstname;
    private String lastname;
    private String phone;
    private Address address;

    // Constructors, getters, and setters
    public Buyer() {
    }

    public Buyer(String email, String firstname, String lastname, String phone, Address address) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    private String street;
    private String city;
    private String country;
    private String zip;

    // Constructors, getters, and setters
    public Address() {
    }

    public Address(String street, String city, String country, String zip) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    // Getters and setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
