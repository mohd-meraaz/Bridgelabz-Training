import java.util.Scanner;

public class PrintHeight{
	public static void main(String[] args){
		// creating scanner variable to take user input
		Scanner sc=new Scanner(System.in);

		// creating height variable and take user input
		int height=sc.nextInt();

		// calculating height in inches and foot
		double inch=height/2.54 , foot=inch/12;
		System.out.println("Your Height in cm is "+height+" while in feet is "+foot+" and inches is "+inch);
	}
}