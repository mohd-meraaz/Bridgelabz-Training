package com.traincompanion;

class TrainCompanion {
    private Compartment head;
    private Compartment tail;
    private Compartment current; // passenger location

    // Add compartment at end
    public void addCompartment(String name, boolean pantry, boolean wifi) {
        Compartment newComp = new Compartment(name, pantry, wifi);

        if (head == null) {
            head = tail = current = newComp;
            return;
        }

        tail.next = newComp;
        newComp.prev = tail;
        tail = newComp;
    }

    // Insert after a given compartment
    public void insertAfter(String afterName, String name, boolean pantry, boolean wifi) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(afterName)) {
                Compartment newComp = new Compartment(name, pantry, wifi);
                newComp.next = temp.next;
                newComp.prev = temp;

                if (temp.next != null) {
                    temp.next.prev = newComp;
                } else {
                    tail = newComp;
                }

                temp.next = newComp;
                return;
            }
            temp = temp.next;
        }
    }

    // Remove compartment
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                if (current == temp)
                    current = temp.next != null ? temp.next : temp.prev;

                return;
            }
            temp = temp.next;
        }
    }

    // Move forward
    public void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            displayCurrent();
        } else {
            System.out.println("You are at the last compartment");
        }
    }

    // Move backward
    public void movePrev() {
        if (current != null && current.prev != null) {
            current = current.prev;
            displayCurrent();
        } else {
            System.out.println("You are at the first compartment");
        }
    }

    // Display adjacent compartments
    public void displayCurrent() {
        System.out.println("\nCurrent: " + current.name);
        System.out.println("Previous: " +
            (current.prev != null ? current.prev.name : "None"));
        System.out.println("Next: " +
            (current.next != null ? current.next.name : "None"));

        System.out.println("Services: " +
            (current.hasPantry ? "Pantry " : "") +
            (current.hasWiFi ? "WiFi" : ""));
    }
}
