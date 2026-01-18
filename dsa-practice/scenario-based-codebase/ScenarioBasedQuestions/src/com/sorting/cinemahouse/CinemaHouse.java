package com.sorting.cinemahouse;
import java.time.*;

public class CinemaHouse {
	public static void main(String[] args) {
		Movie movie[] = {new Movie("3 Ediots",LocalTime.of(12, 11)), new Movie("Kal ho na ho",LocalTime.of(02, 40)), new Movie("King is back",LocalTime.of(22, 30)), new Movie("Bhaijaan",LocalTime.of(16, 45)), new Movie("Bajrangi Bhaijaan",LocalTime.of(14, 45))};
		
		// Calling the sorting algorithm
		bubbleSort(movie,movie.length);
		
		//displaying the List
		System.out.printf("%-30s %-10s\n","Moive", "time");
		for(Movie m : movie) {
			System.out.printf("%-30s %-10s\n",m.moiveName,m.time);
		}
	}
	
	// Algorithm to sort 
	public static void bubbleSort(Movie movie[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				LocalTime time1 = movie[j].time;
				LocalTime time2 = movie[j+1].time;
				if(time1.isAfter(time2)) {
					Movie temp = movie[j];
					movie[j] = movie[j+1];
					movie[j+1] = temp;
				}
			}
		}
	}

}
