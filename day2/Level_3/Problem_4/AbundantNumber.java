import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable to 0
        int sum = 0;

        // Run a for loop from 1 to number-1 to find divisors
        for (int i = 1; i < number; i++) {
            // Check if number is divisible by i
            if (number % i == 0) {
                sum += i;  // Add the divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
