package com.bridgelabz.addressbooksystem;

public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName,
                   String phoneNumber, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    // Sort alphabetically by first name
    @Override
    public int compareTo(Contact other) {
        return this.firstName.compareToIgnoreCase(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                ", Phone: " + phoneNumber +
                ", Email: " + email +
                ", City: " + address.getCity() +
                ", State: " + address.getState();
    }
}
