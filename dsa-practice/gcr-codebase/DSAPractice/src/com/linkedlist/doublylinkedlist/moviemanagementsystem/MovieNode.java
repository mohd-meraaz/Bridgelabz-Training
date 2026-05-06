package com.linkedlist.doublylinkedlist.moviemanagementsystem;

// node to store details of Movie
public class MovieNode {

    String title;        // Title of the movie
    String director;     // Name of the director
    int year;            // release year
    double rating;       // Rating of the movie
    MovieNode next;      // to store next node
    MovieNode prev;      // to store previous node

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}