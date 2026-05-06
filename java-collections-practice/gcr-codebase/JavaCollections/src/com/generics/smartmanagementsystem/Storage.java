package com.generics.smartmanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem>{
	List<T> itemList = new ArrayList<>();
	
	//add item 
	public void addItem(T item) {
		itemList.add(item);
		System.out.println("Added item.");
	}
	
	//get list
	public List<T> getItemList(){
		return itemList;
	}
	
	//display the item list
	public void showItem(List<? extends WarehouseItem> item) {
		for(WarehouseItem items : item) {
			System.out.println("\nItem Name: "+items.itemName);
			System.out.println("Item Price: "+items.price);
			System.out.println("Item Quantity: "+items.quantity);
		}
	}
}