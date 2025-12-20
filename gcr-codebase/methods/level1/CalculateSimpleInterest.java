import java.util.*;

public class CalculateSimpleInterest{
	// Method to calculate simpleInterest
	public static double calculateSimpleInterest(double principal ,double rate ,double time)
	{
		double simpleInterest = (principal * rate * time) / 100;
		return simpleInterest;
	}
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		// Taking user input of all the values
		System.out.print("Enter Principle amount : ")
		double principal = Sc.nextDouble();
		System.out.print("\nEnter rate : ")
		double rate = Sc.nextDouble();
		System.out.print("\nEnter time : ")
		double time = Sc.nextDouble();

		// Calling function
		double simpleInterest = calculateSimpleInterest(principal,rate,time);

		// Displaying the result
		System.out.println("The simpleInterestof the given value is " + simpleInterest);

	}
}