package com.generics.onlinemarketplace;

public class DiscountService {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid discount percentage");
        }

        double discountedPrice =
                product.getPrice() * (1 - percentage / 100);

        product.setPrice(discountedPrice);
    }
}
