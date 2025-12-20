// Java program to check if it is a spring season or not
// Spring Season is from March 20 to June 20

import java.util.Scanner ;

public class CheckSpringSeason{
	// Method to check spring Season
	public static boolean checkSpringSeason(int month, int day){
		if((month == 3 && day >= 20) ||
		   (month == 4) ||
		   (month == 5) ||
		   (month == 6 && day <= 20)) {
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// creating variables for month and day & taking user input
		int month = Sc.nextInt();
		int day = Sc.nextInt();

		boolean season = checkSpringSeason(month , day);

		if(season){
			System.out.println("Its a Spring Season.");
		}
		else{
			System.out.println("It is not a Spring Season.");
		}
	}
}
