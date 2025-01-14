import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String inputString) {
        // Attempting to call substring() with invalid indices (start > end)
        // This will throw a StringIndexOutOfBoundsException, but we are going to handle it as a runtime exception.
        
        String result = inputString.substring(5, 3);  // This will throw StringIndexOutOfBoundsException
        System.out.println(result);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String inputString) {
        try {
            generateException(inputString);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }  finally {
            System.out.println("Exception handling complete.");
        }
    }

    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (at least 6 characters long): ");
        String userInput = scanner.nextLine();
        
        // Check if input length is sufficient for substring
        if (userInput.length() < 6) {
            System.out.println("Input string must be at least 6 characters long.");
            return;
        }

        // First, generate the exception without handling it
        System.out.println("First, calling method to generate the exception...");
        try {
            generateException(userInput);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException while generating exception: " + e.getMessage());
        }

        // Now, call the method to handle the RuntimeException
        System.out.println("\nNow calling method to handle the RuntimeException...");
        handleException(userInput);
        
    }
}
