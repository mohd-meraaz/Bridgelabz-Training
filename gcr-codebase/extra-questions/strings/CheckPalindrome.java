import java.util.Scanner;

public class CheckPalindrome {

    // Creating a function to checkPalindrome
    public static boolean checkPalindrome(String str) {
        String reversedString = reverse(str);
        return str.equals(reversedString);
    }


    // Creating a function to reverse a string
    public static String reverse(String str) {
        int len = str.length();
        String reversedString = "";

        for (int i = len - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter a String : ");
        String input = Sc.nextLine();

        // Calling the function and storing the result
        boolean result = checkPalindrome(input);

        System.out.println(result);

        Sc.close();
    }
}
