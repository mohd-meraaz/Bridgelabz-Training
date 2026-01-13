package com.bridgelabz.gamebox;

abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for free / paid games
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Apply seasonal discount (operator usage)
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public double getPrice() {
        return price;
    }
}
