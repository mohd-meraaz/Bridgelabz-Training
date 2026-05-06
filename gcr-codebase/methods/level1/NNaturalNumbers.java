// java program to check for the natural number and write the sum of n natural numbers 


import java.util.Scanner ;

public class NNaturalNumbers{
	// Creating a method to calculate sum of natural numbers
	public static void sumOfNaturalNumbers(int number){
		// Calculating sum of natural numbers
		int sumNaturalNumbers = ((number * (number+1)) / 2 );
		// checking if the number is natural or not
		if(number>0){
			System.out.println("The sum of " + number + " natural numbers is " + sumNaturalNumbers);
		}
		else{
			System.out.println("The number "+ number +"is not a natural number");
		}

	}
	public static void main(String[] args){
		// creating Scanner Objectto take user input
		Scanner Sc = new Scanner(System.in);

		// taking user input of number 
		System.out.print("Enter a number :- ")
		int number = Sc.nextInt();

		
		// Calling function to display output

		

		sumOfNaturalNumbers(number);


	}
}	
