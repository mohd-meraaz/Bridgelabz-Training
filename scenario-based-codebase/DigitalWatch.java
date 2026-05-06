// 16. Digital Watch Simulation ⏱️
// Simulate a 24-hour watch:
// ● Print hours and minutes in a nested for-loop.
// ● Use a break to stop at 13:00 manually (simulate power cut).
// Core Java Scenario Based Problem Statements

public class DigitalWatch {

    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                // Power cut condition at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped at 13:00");
                    break;
                }

                // Print time in HH:MM format
               System.out.println(
                    (hour < 10 ? "0" + hour : hour) + ":" +
                    (minute < 10 ? "0" + minute : minute)
                );

            }

            // Exit outer loop after power cut
            if (hour == 13) {
                break;
            }
        }
    }
}
