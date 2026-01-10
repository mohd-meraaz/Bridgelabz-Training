package com.bridgelabz.artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User user) {
        completePurchase(user);
        System.out.println("Print will be shipped to buyer");
    }

    @Override
    public void license(User user) {
        System.out.println("Print license applied: " + licenseType);
        System.out.println("Limited reproduction rights");
    }
}
