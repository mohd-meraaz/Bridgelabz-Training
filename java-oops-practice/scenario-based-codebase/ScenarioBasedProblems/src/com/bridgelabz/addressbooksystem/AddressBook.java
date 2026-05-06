package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate check
    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName()) &&
                c.getLastName().equalsIgnoreCase(contact.getLastName())) {
                System.out.println("Duplicate contact not allowed.");
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    // Edit contact by name
    public boolean editContact(String firstName, String lastName,
                               String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) &&
                c.getLastName().equalsIgnoreCase(lastName)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                return true;
            }
        }
        System.out.println("Contact not found.");
        return false;
    }

    // Delete contact
    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(c ->
            c.getFirstName().equalsIgnoreCase(firstName) &&
            c.getLastName().equalsIgnoreCase(lastName));
    }

    // Search by city or state
    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
            }
        }
    }

    // Display all contacts sorted
    public void displayAllContacts() {
        Collections.sort(contacts);
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
