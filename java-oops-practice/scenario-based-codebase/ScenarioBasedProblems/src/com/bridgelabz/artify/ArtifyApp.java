package com.bridgelabz.artify;
public class ArtifyApp {
    public static void main(String[] args) {

        User buyer = new User("Rohit", 5000);

        Artwork art1 = new DigitalArt(
                "Neon Dreams", "Alex", 1500,
                "Commercial", true);

        Artwork art2 = new PrintArt(
                "Sunset Canvas", "Maria", 2000,
                "Personal");

        art1.purchase(buyer);
        art1.license(buyer);

        art2.purchase(buyer);
        art2.license(buyer);

        System.out.println("Remaining Wallet Balance: ₹" +
                buyer.getWalletBalance());
    }
}
