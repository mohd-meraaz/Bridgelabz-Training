import java.util.Scanner;
public class DoubleOperation{
	public static void main(String[] args){
		// creating scanner variable to take user input
		Scanner sc=new Scanner(System.in);

		// creating variables and taking user input
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();

		// calculating operations
		double p=a+b*c;
		double q=a*b+c;
		double r=c+a/b;
		double s=a%b+c;

		// displaying the output
		System.out.println("The result of Int Operations are "+p+" , "+q+" , "+r+" , and "+s);

}

}