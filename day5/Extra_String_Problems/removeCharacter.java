import java.util.Scanner;


public class RemoveCharacter {

	 // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        String result = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Add the character to result if it is not the one to remove
            if (currentChar != charToRemove) {
                result += currentChar;
            }
        }

        return result; // Return the modified string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the string and the character to remove
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Call the method to remove the character
        String result = removeCharacter(str, charToRemove);

        // Display the result
        System.out.println("String after removal: " + result);

        scanner.close();
    }

   
}
