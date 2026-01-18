package com.sorting.artexpo;
import java.time.LocalTime;

public class ArtExpoApp {
	public static void main(String[] args) {
		Artists artists[] = {new Artists("Allu",LocalTime.of(12, 11)), new Artists("Pushpa",LocalTime.of(02, 40)), new Artists("Alice",LocalTime.of(22, 30)), new Artists("King",LocalTime.of(16, 45)), new Artists("Sallu",LocalTime.of(14, 45))};
		
		//call method to sort
		bubbleSort(artists,artists.length);
		
		//display
		System.out.printf("%-30s %-10s\n","Artist Name", "Time");
		for(Artists m : artists) {
			System.out.printf("%-30s %-10s\n",m.artistsName,m.time);
		}
	}
	
	public static void bubbleSort(Artists artists[], int n) {
		for(int i=1;i<n;i++) {
			Artists top = artists[i];
			
			int j = i-1;
			while(j>=0) {
				if(artists[j].time.isAfter(top.time)) {
					artists[j+1] = artists[j];
					j-=1;
				}else {
					break;
				}
			}
			artists[j+1] = top;
		}
	}
}
