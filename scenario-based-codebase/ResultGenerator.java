import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 5;

        // Input marks using for-loop
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average
        double average = totalMarks / (double) numberOfSubjects;
        System.out.println("Average Marks: " + average);

        // Determine grade using switch
        int gradeCategory = (int) average / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        scanner.close();
    }
}
