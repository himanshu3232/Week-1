import java.util.Scanner;

public class ToggleCase {

	 // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        String result = ""; // Result string

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is lowercase, convert it to uppercase
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            }
            // If the character is uppercase, convert it to lowercase
            else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            }
            // If it's neither, just add the character as is
            else {
                result += c;
            }
        }

        return result; // Return the toggled string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to toggle the case of each character
        String toggledString = toggleCase(input);

        // Display the result
        System.out.println("Toggled string: " + toggledString);

        scanner.close();
    }

   
}
