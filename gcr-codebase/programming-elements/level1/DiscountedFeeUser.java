import java.util.Scanner;

public class DiscountedFeeUser{
	public static void main(String[] args){
		// creating a scanner to take user input
		Scanner sc=new Scanner(System.in);

		// creating to variable to store fee and taking user input
		int fee=sc.nextInt();

		// creating an variable for discountPercent  and taking user input
		int discountPercent=sc.nextInt();

		// Calculating discount
		double discount=fee*discountPercent/100;

		// Calculating discounted fee
		double discountfee=fee-discount;

		// displaying the result
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountfee);
	}	
}