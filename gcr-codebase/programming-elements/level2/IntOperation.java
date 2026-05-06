import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		// creating scanner variable to take user input
		Scanner sc=new Scanner(System.in);

		// creating variables and taking user input
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		// calculating operations
		int p=a+b*c;
		int q=a*b+c;
		int r=c+a/b;
		int s=a%b+c;

		// displaying the output
		System.out.println("The result of Int Operations are "+p+" , "+q+" , "+r+" , and "+s);

}

}