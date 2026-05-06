package com.traincompanion;

public class Main {
    public static void main(String[] args) {
        TrainCompanion train = new TrainCompanion();

        train.addCompartment("C1", false, true);
        train.addCompartment("C2", true, true);
        train.addCompartment("C3", false, false);
        train.addCompartment("C4", true, false);

        train.displayCurrent();
        train.moveNext();
        train.moveNext();
        train.movePrev();

        train.insertAfter("C2", "C2A", false, true);
        train.removeCompartment("C3");

        train.moveNext();
    }
}
