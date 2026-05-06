package com.praceltracker;

class ParcelTracker {
    private StageNode head;

    // Add initial stage
    public void addStage(String stageName) {
        if (head == null) {
            head = new StageNode(stageName);
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new StageNode(stageName);
    }

    // Add custom checkpoint after a stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equals(afterStage)) {
                StageNode checkpoint = new StageNode(newStage);
                checkpoint.next = temp.next;
                temp.next = checkpoint;
                return;
            }
            temp = temp.next;
        }
    }

    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost or tracking unavailable");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null)
                System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Simulate lost parcel
    public void markLost() {
        head = null;
    }
}
