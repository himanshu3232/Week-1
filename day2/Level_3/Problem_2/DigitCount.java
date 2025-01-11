import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize the count variable to 0
        int count = 0;

        // Use a loop to iterate until the number becomes 0
        while (number != 0) {
            // Remove the last digit by dividing the number by 10
            number /= 10;

            // Increase the count by 1 in each iteration
            count++;
        }

        // Display the count (number of digits)
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}
