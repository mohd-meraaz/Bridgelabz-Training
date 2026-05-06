package com.bridgelabz.gamebox;

import java.util.*;

class User {
    private String username;
    private List<Game> ownedGames; // protected from direct access

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.title);
    }

    public void showLibrary() {
        System.out.println("\n🎮 " + username + "'s Game Library:");
        for (Game g : ownedGames) {
            System.out.println(g.title + " | ₹" + g.getPrice());
        }
    }
}
