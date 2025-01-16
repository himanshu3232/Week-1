import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = input.nextLine();

        // Initialize counts
        int vowels = 0, consonants = 0;

        // Loop through the string
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i)); // Convert to lowercase

            if (c >= 'a' && c <= 'z') { // Check if it's a letter
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++; // It's a vowel
                } else {
                    consonants++; // It's a consonant
                }
            }
        }

        // Display results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        input.close();
    }
}
