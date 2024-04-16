package com.java17.study01.records.types;

public class RecordExample4 {

    public static void main(String[] args) {

        var person = new Person1(1001L, new FullName("Joe", "Exter"), new NickName("Joter"), new EmailAddress("joe.exter@abc.com"));
        System.out.println(person);
    }
}
