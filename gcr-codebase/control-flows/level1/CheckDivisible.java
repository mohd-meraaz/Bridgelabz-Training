// Java program to check if a number is divisible by 5

import java.util.Scanner;

public class CheckDivisible{
	public static void main(String[] args){
		// Creating a scanner Object
		Scanner sc = new Scanner(System.in);

		// creating variable number and taking user input of value
		int number = sc.nextInt();

		System.out.println("Is the number " + number+" divisible by 5? "+ (number%5 ==0));
	}
}