import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable to store the sum of cubes of digits
        int sum = 0;

        // Store the original number for comparison later
        int originalNumber = number;

        // Use a while loop until the number becomes 0
        while (number != 0) {
            // Find the last digit using modulus operator
            int digit = number % 10;

            // Find the cube of the digit and add it to the sum
            sum += Math.pow(digit, 3);

            // Remove the last digit by dividing the number by 10
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
