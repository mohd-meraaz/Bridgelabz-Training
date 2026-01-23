package com.bridgelabz.tinytownstorage;

import java.util.ArrayList;
import java.util.List;

public class BagBallApp {

    public static void main(String[] args) {

        List<Bag> bags = new ArrayList<>();

        // Create bags
        Bag bag1 = new Bag("B1", "Red", 2);
        Bag bag2 = new Bag("B2", "Blue", 3);

        bags.add(bag1);
        bags.add(bag2);

        // Create balls
        Ball ball1 = new Ball("BL1", "Yellow", "Small");
        Ball ball2 = new Ball("BL2", "Green", "Medium");
        Ball ball3 = new Ball("BL3", "Blue", "Large");

        // Add balls
        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); // Will fail (capacity reached)

        bag2.addBall(ball3);

        // Display contents
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove a ball
        bag1.removeBall("BL1");
        bag1.displayBalls();

        // Display all bags and ball count
        System.out.println("\nAll Bags Summary:");
        for (Bag bag : bags) {
            System.out.println(
                "Bag ID: " + bag.getId() +
                ", Color: " + bag.getColor() +
                ", Balls: " + bag.getBallCount() +
                "/" + bag.getCapacity()
            );
        }
    }
}
