import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
     // Create scanner object for user input
     Scanner scanner = new Scanner(System.in);

      // Ask the user to enter a number
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();

       // Initialize the greatestFactor variable to 1
      int greatestFactor = 1;

      // Loop from number - 1 to 1
      for (int i = number - 1; i >= 1; i--) {
          // Check if the number is divisible by i
          if (number % i == 0) {
            greatestFactor = i; // Assign i to greatestFactor
             break; // Break the loop once the greatest factor is found
            }
        }

        // Print the greatest factor found
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        // Close the scanner
        scanner.close();
    }
}