// Java program to count down RocketLaunch using for loop
import java.util.Scanner ;
public class CountDownFor{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// creating variable and taking input of starting value
		int number = Sc.nextInt();

		for(int i=number ; i>0; i--){
			System.out.print(i + "\n");
		}

	}
}	
