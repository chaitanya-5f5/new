package pr1;

import java.util.Scanner;

public class WeekdayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number between 1 and 7: ");
        int userInput = scanner.nextInt();

        // Validate user input
        if (userInput < 1 || userInput > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            // Generate and display the corresponding weekday name
            String weekday = getWeekdayName(userInput);
            System.out.println("The weekday corresponding to " + userInput + " is: " + weekday);
        }

        scanner.close();
    }

    // Function to get the weekday name based on the input number
    private static String getWeekdayName(int dayNumber) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return weekdays[dayNumber - 1];
    }
}
