package com.bridgelabz.artify;
public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;

    protected String licenseType;     // protected licensing terms
    protected boolean hasPreview;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price,
                   String licenseType, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    protected void completePurchase(User user) {
        if (user.deductBalance(price)) {
            System.out.println(user.getName() + " purchased " + title);
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }
}
