package com.sorting.smartlibrary;

public class SmartLibraryApp {
	public static void main(String[] args) {
		Book[] books = {new Book("Atomic Habit"),new Book("The Will"),new Book("Dark Person"),new Book("Bill Gates"),new Book("World War Two")};
		insertionSort(books,books.length);
		
		
		for(Book b : books) {
			System.out.println(b.title);
		}
	}
	
	//insertion sorting algorithm
	public static void insertionSort(Book books[], int n) {		
		
		for(int i=1;i<n;i++) {
			String top = books[i].title;
			int j = i-1;
			while(j>=0) {
				if((books[j].title.compareToIgnoreCase(top))>0) {
					books[j+1].title = books[j].title;
					j-=1;
				}else {
					break;
				}
			}
			books[j+1].title = top;
		}
	}
}
