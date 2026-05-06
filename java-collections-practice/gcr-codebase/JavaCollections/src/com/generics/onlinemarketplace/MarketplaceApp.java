package com.generics.onlinemarketplace;

public class MarketplaceApp {

	    public static void main(String[] args) {

	        Product<BookCategory> book =
	                new Product<>("Java Mastery", 50.0, BookCategory.EDUCATIONAL);

	        Product<ClothingCategory> shirt =
	                new Product<>("T-Shirt", 20.0, ClothingCategory.MEN);

	        Product<GadgetCategory> phone =
	                new Product<>("Smartphone", 800.0, GadgetCategory.MOBILE);

	        ProductCatalog catalog = new ProductCatalog();
	        catalog.addProduct(book);
	        catalog.addProduct(shirt);
	        catalog.addProduct(phone);

	        DiscountService.applyDiscount(book, 10);
	        DiscountService.applyDiscount(phone, 5);

	        catalog.showCatalog();
	    }
	}
