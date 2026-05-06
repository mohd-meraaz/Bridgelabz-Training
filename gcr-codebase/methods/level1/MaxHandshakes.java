// java program to find the maximum number of handshakes 

import java.util.Scanner;


public class MaxHandshakes{
	// calculating total number of handshakes
	public static int calculateHandshake(int student){
		int shake=(student*(student-1))/2;
		return shake;
	}
	public static void main(String[] args){
		// creating a scanner variable to take user input
		Scanner sc=new Scanner(System.in);

		// creating variable to store n number of students and take user input
		System.out.print("Enter the number of students : ");
		int student=sc.nextInt();

		// Calling function
		int handshakes = calculateHandshake(student);

		//displaying the result
		System.out.println("The number of possible handshake is "+handshakes);
}
}