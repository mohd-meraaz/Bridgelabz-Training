package com.bridgelabz.artify;


public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price,
                      String licenseType, boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    @Override
    public void purchase(User user) {
        completePurchase(user);
    }

    @Override
    public void license(User user) {
        System.out.println("Digital license applied: " + licenseType);
        System.out.println("Usage allowed for web & mobile platforms");
    }
}
