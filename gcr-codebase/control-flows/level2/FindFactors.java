// program to find the factors of a number taken as user input.

import java.util.Scanner ;
public class FindFactors{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Taking user input of number
		int number = Sc.nextInt();

		System.out.println("The factors of "+number+" are : ");
		// Checking the factors and printing it
		for(int i = 1; i<=number ; i++){
			if(number%i==0){
				System.out.println(i);
			}
		}

		// Closing the scanner
		Sc.close();
	}
}	



