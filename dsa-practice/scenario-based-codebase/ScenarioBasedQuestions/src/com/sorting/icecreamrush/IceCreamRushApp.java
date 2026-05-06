package com.sorting.icecreamrush;

public class IceCreamRushApp {
	public static void main(String[] args) {
		Flavors flavors[] = {new Flavors("Vanilla",20), new Flavors("Chocolate",120), new Flavors("Strawberry",10), new Flavors("Kulfi",15), new Flavors("Green Tea",5), new Flavors("Red Velvet",43), new Flavors("Mango",100), new Flavors("Black Chocolate",220)};
		bubbleSort(flavors,flavors.length);
		
		//displaying all the functions
		System.out.printf("%-20s %-20s\n\n","IceCream Name","Sold");
		for(Flavors f : flavors) {
			System.out.printf("%-20s %-20s\n",f.name,f.sold);
		}
	}
	
	//bubble sort function
	public static void bubbleSort(Flavors flavors[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(flavors[j].sold<=flavors[j+1].sold) {
					Flavors temp = flavors[j];
					flavors[j] = flavors[j+1];
					flavors[j+1] = temp;
				}
			}
		}
	}
}


