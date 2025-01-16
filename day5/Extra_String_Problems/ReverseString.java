import java.util.Scanner;

public class ReverseString {
	 // Method to reverse a string without using built-in reverse functions
    public static String reverse(String str) {
        String reversed = ""; // Empty string to store the reversed string

        // Loop through the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Call the method to reverse the string
        String reversedString = reverse(str);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        input.close();
    }

   
}
