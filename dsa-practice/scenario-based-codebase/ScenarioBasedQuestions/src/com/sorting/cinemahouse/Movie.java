package com.sorting.cinemahouse;
import java.time.*;

public class Movie {
	String moiveName;
	LocalTime time;
	
	public Movie(String moiveName, LocalTime time) {
		this.moiveName = moiveName;
		this.time = time;
	}
}