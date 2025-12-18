// Java program to count down RocketLaunch 
import java.util.Scanner ;
public class CountDownWhile{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// creating variable and taking input of starting value
		int number = Sc.nextInt();

		while(number >0){
			System.out.println(number +"\n");
			number -=1;
		}

	}
}	
