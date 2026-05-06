import java.util.Scanner;

public class SchoolBusAttendance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array of student names
        String[] students = {
            "Amit", "Riya", "Karan", "Neha", "Vikas",
            "Pooja", "Rahul", "Sneha", "Arjun", "Meera"
        };

        int presentCount = 0;
        int absentCount = 0;

        // For-each loop to check attendance
        for (String student : students) {

            System.out.print("Is " + student + " present? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Display attendance summary
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);

        scanner.close();
    }
}
