// Java program to check if the first is the smallest of the 3 numbers.


import java.util.Scanner;

public class LargestOfThree{
	public static void main(String[] args){
		// Creating a scanner Object
		Scanner sc = new Scanner(System.in);

		// creating variable numbers and taking user input of value
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
	

		// Displaying the results
		System.out.println("Is the first number the largest? " + ((number1>number2)&(number1>number3)));
		System.out.println("Is the second number the largest? " + ((number2>number1)&(number2>number3)));
		System.out.println("Is the third number the largest? " + ((number3>number2)&(number3>number1)));

	}
}