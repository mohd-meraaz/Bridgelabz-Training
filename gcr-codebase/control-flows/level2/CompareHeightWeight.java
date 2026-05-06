import java.util.Scanner ;
public class CompareHeightWeight{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		//Taking user input of heights and ages of Amar, Akbar, and Anthony
		System.out.print("Enter the height of Amar : \n");
		int amarHeight = Sc.nextInt();
		System.out.print("Enter the weight of Amar : \n");
		int amarAge = Sc.nextInt();
		System.out.print("Enter the height of Akbar : \n");
		int akbarHeight = Sc.nextInt();
		System.out.print("Enter the weight of Akbar : \n");
		int akbarAge  = Sc.nextInt();
		System.out.print("Enter the height of Anthony : \n");
		int anthonyHeight = Sc.nextInt();
		System.out.print("Enter the weight of Anthony : \n");
		int anthonyAge  = Sc.nextInt();



		// Finding youngest friend
		if((amarAge<akbarAge) && (amarAge<anthonyAge)){
			System.out.println("Amar is youngest among all his friends.");
		}
		else if(akbarAge<anthonyAge){
			System.out.println("Akbar is youngest among all his friends.");
		}
		else {
			System.out.println("Anthony is youngest among all his friends.");
		}

		// finding tallest Friend
		if((amarHeight>akbarHeight) && (amarHeight>anthonyHeight)){
			System.out.println("Amar is tallest among all his friends.");
		}
		else if(akbarHeight>anthonyHeight){
			System.out.println("Akbar is tallest among all his friends.");
		}
		else {
			System.out.println("Anthony is tallest among all his friends.");
		}



		




		// Closing the scanner
		Sc.close();
	}
}	



