package com.generics.smartmanagementsystem;
import java.util.List;

public class Display {
	
	//display the item list
	public void showItem(List<? extends WarehouseItem> item) {
		for(WarehouseItem items : item) {
			System.out.println("\nItem Name: "+items.itemName);
			System.out.println("Item Price: "+items.price);
			System.out.println("Item Quantity: "+items.quantity);
		}
	}
} 