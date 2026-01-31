package com.lambda.customsorting;

import java.util.ArrayList;

public class CustomSortingECommerce {
	public static void main(String[] args) {
		ArrayList<Product> prod = new ArrayList<>();
		prod.add(new Product(23433.0, 4.5,20));
		prod.add(new Product(23333.0, 6.5,10));
		prod.add(new Product(92333.0, 7.5,10));
		prod.add(new Product(23373.0, 4.5,40));
		prod.add(new Product(23343.0, 2.5,50));
		prod.add(new Product(23233.0, 9.5,60));
		prod.add(new Product(23333.0, 8.5,80));
		prod.add(new Product(27333.0, 2.5,40));
		
		
		
		prod.stream().sorted((Product prod1,Product prod2)->Double.compare(prod1.price, prod2.price)).forEach(System.out::println);
		
	}
}
