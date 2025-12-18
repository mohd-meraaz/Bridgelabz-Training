// program to find the factors of a number taken as user input using while loop.

import java.util.Scanner ;
public class FindFactorsWhile{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Taking user input of number
		int number = Sc.nextInt();

		System.out.println("The factors of "+number+" are : ");

		// Checking the factors and printing it
		int i = 1;           
		while (i <= number) { 
    		if (number % i == 0) {
        		System.out.println(i);
    		}
    		i++;             
		}


		// Closing the scanner
		Sc.close();
	}
}	



