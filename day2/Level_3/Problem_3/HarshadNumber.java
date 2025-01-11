import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable to 0
        int sum = 0;
        int originalNumber = number;  // Store the original number for later comparison

        // Use a while loop to access each digit of the number
        while (number != 0) {
            // Add the last digit to sum
            sum += number % 10;

            // Remove the last digit
            number /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
