// java program to count the numbers till user enters 0
import java.util.Scanner ;
public class CountTillZero{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variables to take user inputs and store sum
		double Sum = 0.0;
		double value;

		while(true){
			value = Sc.nextDouble();
			if(value == 0){
				break;
			}
			else{
				Sum = Sum + value;
			}


		}

		System.out.println("The sum of all the numbers entered is "+ Sum);

	}
}	
