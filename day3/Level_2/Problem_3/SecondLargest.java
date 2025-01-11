import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Define maximum size of array
        final int maxDigit = 10;
        
        // Array to store digits of the number
        int[] digits = new int[maxDigit];
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Variable to store the index of the array
        int index = 0;
        
        // Loop to extract digits from the number and store in array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;  // Get the last digit
            number = number / 10;         // Remove the last digit
            index++;                      // Increment index
        }
        
        // Initialize variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        
        // Loop through the digits array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        
        // Display the largest and second largest digits
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
        
        // Close the scanner
        scanner.close();
    }
}
