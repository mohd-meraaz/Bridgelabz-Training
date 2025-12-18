import java.util.Scanner ;
public class CheckPersonCanVote{
	public static void main(String[] args){
		// creating Scanner Objectto take user input
		Scanner Sc = new Scanner(System.in);

		// Taking input of age
		int age = Sc.nextInt();

		// Checking if the person can vote or not
		if(age>=18){
			System.out.println("The person's age is "+age+" and can vote.");
		}
		else{
			System.out.println("The person's age is "+age+" and cannot vote.");
		}


	}
}	
