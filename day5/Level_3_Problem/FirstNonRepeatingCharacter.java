import java.util.Scanner;

class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char firstNonRepeating(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII size)

        // Loop to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the count at the ASCII index of the character
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the first non-repeating character
        char result = firstNonRepeating(text);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
