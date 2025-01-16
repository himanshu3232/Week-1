import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel or consonant
    // This method takes a character and checks whether it is a vowel, consonant, or not a letter.
    public static String checkCharacterType(char ch) {
        
        // Convert uppercase letter to lowercase for uniformity
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }

        // Check if the character is a letter and classify it as vowel or consonant
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";  // Character is a vowel
            } else {
                return "Consonant";  // Character is a consonant
            }
        }
        return "Not a Letter";  // Character is not a letter
    }

    // Method to count vowels and consonants in a string
    // This method counts the vowels and consonants in the input string.
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0, consonantCount = 0;

        // Loop through the string and classify each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // Get character from the string
            String type = checkCharacterType(ch);  // Determine if it's a vowel, consonant, or not a letter

            // Increment the respective count based on the character type
            if (type.equals("Vowel")) {
                vowelCount++;  // Increase vowel count if it's a vowel
            } else if (type.equals("Consonant")) {
                consonantCount++;  // Increase consonant count if it's a consonant
            }
        }

        // Return the counts of vowels and consonants as an array
        return new int[] { vowelCount, consonantCount }; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);

        scanner.close();  // Close the scanner to prevent memory leaks
    }
}
