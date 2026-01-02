package com.objectmodeling.library;

public class LibraryMain {
	public static void main(String[] args) {
		// Books created independently
		Book b1 = new Book("Godan", "Premchand", 2390);
        Book b2 = new Book("Gunah", "Dharm", 1110);

        // Library object
        Library library = new Library();

        // Adding books to library (Aggregation)
        library.addBook(b1);
        library.addBook(b2);

        // Display books
        library.displayLibraryBooks();
	}

}
