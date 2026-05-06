// Java program to check if the first is the smallest of the 3 numbers.


import java.util.Scanner;

public class SmallestOfThree{
	public static void main(String[] args){
		// Creating a scanner Object
		Scanner sc = new Scanner(System.in);

		// creating variable numbers and taking user input of value
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		boolean value = false;

		//cheking if the number is smallest or not
		if ((number1<number2) && (number1<number3))
		{
			value = true;

		}

		// Displaying the results
		System.out.println("Is the first number the smallest? " + value);
		

	}
}