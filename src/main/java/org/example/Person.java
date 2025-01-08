package org.example;

public class Person {

    // Instance Variables
    private String firstName;
    private String lastName;
    private int age;

    // Ek instance değişkenler
    private String address;
    private String phoneNumber;
    private String email;

    // Constructor - firstname, lastname ve age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor - tüm parametreler (constructor chaining)
    public Person(String firstName, String lastName, int age, String address, String phoneNumber, String email) {
        this(firstName, lastName, age); // Diğer constructor çağrısı
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Method - isTeen
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
