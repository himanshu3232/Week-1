import java.util.Scanner;
import java.util.Arrays;

public class FindLargestAndSecondLargest {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Define initial size of array
        int maxDigit = 10;
        
        // Array to store digits of the number
        int[] digits = new int[maxDigit];
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Variable to store the index of the array
        int index = 0;
        
        // Loop to extract digits from the number and store in array
        while (number != 0) {
            // Check if array size is full and needs to be expanded
            if (index == maxDigit) {
                maxDigit += 10;  // Increase the array size by 10
                
                // Create a new temporary array with the new size
                int[] tempArray = new int[maxDigit];
                
                // Copy existing elements from digits array to tempArray
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                
                // Assign tempArray to digits
                digits = tempArray;
            }
            
            // Add the last digit to the array
            digits[index] = number % 10;
            number = number / 10;  // Remove the last digit
            index++;  // Increment index
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
