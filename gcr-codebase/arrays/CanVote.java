import java.util.Scanner ;
public class CanVote
{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// creating an array to store ages
		int ages[] = new int [11];
		int temp = 0;

		// Taking user input of ages
		for(int i = 0 ; i<=10 ; i++){
			System.out.print("Enter your age : ");
			int value = Sc.nextInt();
			if(value>0){
				ages[temp++]=value;
			}else{
				System.out.println("Invalid age.");
			}
		}

		for(int val : ages){
			if(val > 17){
				System.out.println("The student with the age "+val+" can vote.");
			}

			else{
				System.out.println("The student with the age "+val+" cannot vote.");
			}
		}





		// Closing the scanner
		Sc.close();
	}
}	



