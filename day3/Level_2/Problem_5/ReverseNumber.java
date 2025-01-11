import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find the number of digits in the number
        int temp = number;
        int digitCount = 0;
        
        while (temp != 0) {
            temp = temp / 10;  // Remove the last digit
            digitCount++;      // Count the number of digits
        }
        
        // Create an array to store digits
        int[] digits = new int[digitCount];
        
        // Store digits in the array
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;  // Get the last digit
            temp = temp / 10;       // Remove the last digit
        }
        
        // Create an array to store digits in reverse order
        int[] reversedDigits = new int[digitCount];
        
        // Store the digits in reverse order
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
        
        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
