package com.bridgelabz.gamebox;

public class GameBoxApp {
    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Racer", 299, 4.5);
        Game g2 = new StrategyGame("War Tactics", 499, 4.7);

        User user = new User("Neha");

        g1.playDemo();
        g2.playDemo();

        g1.applyDiscount(20); // seasonal offer
        user.buyGame(g1);
        user.buyGame(g2);

        user.showLibrary();
    }
}
