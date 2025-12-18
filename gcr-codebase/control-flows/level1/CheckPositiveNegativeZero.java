import java.util.Scanner ;
public class CheckPositiveNegativeZero{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// creating variable number and taking user input 
		int number = Sc.nextInt();


		if(number == 0){
			System.out.println("Number "+number+" is zero");
		}
		else if(number > 0){
			System.out.println("Number "+number+" is a positive number");

		}
		else{
			System.out.println("Number "+number+" is a negative number");
			
		}


	}
}	
