import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate number of digits
        int numDigits = String.valueOf(number).length();
        
        // Array to store digits (assuming maximum digits are 10)
        int[] digitsArray = new int[numDigits];
        
        // Extract digits and store in array
        int temp = number;
        for (int i = numDigits - 1; i >= 0; i--) {
            digitsArray[i] = temp % 10;
            temp /= 10;
        }
        
        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Calculate frequency of each digit
        for (int digit : digitsArray) {
            frequency[digit]++;
        }
        
        // Display frequencies
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
        scanner.close();
    }
}
