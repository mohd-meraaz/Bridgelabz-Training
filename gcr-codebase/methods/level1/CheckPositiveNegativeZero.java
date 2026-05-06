// Java program to check whether a number is positive, negative, or zero.

import java.util.Scanner ;


public class CheckPositiveNegativeZero{

	// Method to check 
	public static void check(int number){
		if(number == 0){
			System.out.println("Number "+number+" is zero");
		}
		else if(number > 0){
			System.out.println("Number "+number+" is a positive number");

		}
		else{
			System.out.println("Number "+number+" is a negative number");
			
		}
	}

	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// creating variable number and taking user input 
		System.out.print("Enter a number : ");
		int number = Sc.nextInt();

		check(number);

		


	}
}	
