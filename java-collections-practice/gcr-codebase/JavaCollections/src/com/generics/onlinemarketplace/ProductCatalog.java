package com.generics.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
        products.forEach(System.out::println);
    }
}
