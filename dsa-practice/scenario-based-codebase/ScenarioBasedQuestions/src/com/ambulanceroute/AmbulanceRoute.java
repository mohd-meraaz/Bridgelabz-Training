package com.ambulanceroute;

class AmbulanceRoute {
    private UnitNode head;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        UnitNode newUnit = new UnitNode(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        UnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newUnit;
        newUnit.next = head;
    }

    // Remove unit (maintenance)
    public void removeUnit(String name) {
        if (head == null) return;

        UnitNode curr = head, prev = null;

        do {
            if (curr.name.equals(name)) {
                // single node case
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // removing head
                if (curr == head) {
                    UnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Find nearest available unit
    public String routePatient() {
        if (head == null) return "No units available";

        UnitNode temp = head;
        do {
            if (temp.available) {
                return "Redirect patient to: " + temp.name;
            }
            temp = temp.next;
        } while (temp != head);

        return "All units busy";
    }

    // Display units
    public void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units");
            return;
        }

        UnitNode temp = head;
        do {
            System.out.print(
                temp.name + "(" + (temp.available ? "Available" : "Busy") + ") → "
            );
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to " + head.name + ")");
    }
}
