package com.day12.practiceset;

public class _01LibraryBookTracker {

    public static class Book {
        public static int totalBooksInLibrary = 0;
        public static int totalBooksCheckedOut = 0;
        private int isBn;
        private String title;
        private String author;


        public Book(int isBn, String title, String author) {
            this.isBn = isBn;
            this.title = title;
            this.author = author;
            totalBooksInLibrary++;
        }

        public int getIsBn() {
            return isBn;
        }

        public void setIsBn(int isBn) {
            this.isBn = isBn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void checkOut(Book book) {
            System.out.println("The Book named"+ book.title + "Checked Out");
            totalBooksCheckedOut++;
        }
        public void returnBook(int isBn){
            System.out.println("The Book named"+ getAuthor() + "Checked Out");
            totalBooksCheckedOut--;
        }
    }
    
static void main() {
    Book b1 = new Book(1,"Mathematics-I","RD. Sharma" );
    Book b2 = new Book(2,"Mathematics-II","RD. Sharma" );
    Book b3 = new Book(3,"Learn Coding" , "Harry");
    Book b4 = new Book(4,"Learn python","Harry");
    Book b5 = new Book(5,"Physics","HC. Verma");

    b1.checkOut(b1);
    b2.checkOut(b2);
    b3.checkOut(b3);

    b1.returnBook(b1.isBn);

    System.out.println(Book.totalBooksCheckedOut);


}
}
