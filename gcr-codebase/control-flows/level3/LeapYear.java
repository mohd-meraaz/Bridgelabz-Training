// Java program to find given year is leapyear or not

import java.util.Scanner ;
public class LeapYear{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating a variable and taking user input of year
		int year = Sc.nextInt();


		// Checking if the year if greater than 1582 or not
		if(year>1581){

			if (year % 400 == 0)
           		{
                	System.out.println("Leap Year ");
            	}
            else if (year % 100 == 0)
            	{
                	System.out.println("Not a Leap Year ");
            	}
            else if (year % 4 == 0)
            	{
                	System.out.println("Leap Year ");
            	}
            else
            	{
                	System.out.println("Not a Leap Year ");
            	}



		}

		else{
			System.out.println("You have entered an year before Gregorian calendar.");
		}






		// Closing the scanner
		Sc.close();
	}
}	



