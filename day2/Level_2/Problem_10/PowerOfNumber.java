import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the base number
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        // Ask the user to enter the power (exponent)
        System.out.print("Enter the power (exponent): ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Loop from 1 to power (inclusive)
        for (int i = 1; i <= power; i++) {
            // Multiply result by the base number in each iteration
            result *= number;
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}