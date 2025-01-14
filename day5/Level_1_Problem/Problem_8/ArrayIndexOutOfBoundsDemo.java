import java.util.*;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
         
        String name = names[names.length + 1];  // This will throw ArrayIndexOutOfBoundsException if the length is less than 6
        System.out.println(name);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            System.out.println("Exception handling complete.");
        }
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names you want to input: ");
        int numNames = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // Create an array to hold the names
        String[] names = new String[numNames];
        
        // Taking names from the user
        System.out.println("Enter " + numNames + " names:");
        for (int i = 0; i < numNames; i++) {
            names[i] = scanner.nextLine();
        }
        
        // Call the method to generate exception
        System.out.println("First, calling method to generate the exception...");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException while generating exception: " + e.getMessage());
        }

        // Now, call the method to handle the ArrayIndexOutOfBoundsException
        System.out.println("\nNow calling method to handle the RuntimeException...");
        handleException(names);
        
        scanner.close();
    }
}
