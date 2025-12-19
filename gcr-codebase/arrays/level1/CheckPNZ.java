// Java program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner ;
public class CheckPNZ{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating an array
		int arr[] = new int[5];

		System.out.print("Enter the array elements : ");
		// Taking the user input of array
		for(int i = 0 ; i<5 ; i++){
			int val = Sc.nextInt();
			arr[i] = val;
		}

		// Checking for the conditions positive, negative, zero && even odd

		for(int number  : arr){
			if(number>0){
				System.out.println("The number "+number+" is a positive number.");
				if(number%2==0){
					System.out.println("The number "+number+" is an even number.");
				}
				else{
					System.out.println("The number "+number+" is an odd number.");
				}
			}
			else if(number<0){
				System.out.println("The number "+number+" is a negative number.");
			}
			else{
				System.out.println("The number "+number+" is a zero.");
			}
		}

		// comparing first and last element

		int first = arr[0];
		int last = arr[4];

		if(first>last){
			System.out.println("The first element is Greatest");
		}
		else if(first<last){
			System.out.println("The last element is Greatest");
		}
		else{
			System.out.println("Both first and last elements are equal.");
		}



		// Closing the scanner
		Sc.close();
	}
}	





