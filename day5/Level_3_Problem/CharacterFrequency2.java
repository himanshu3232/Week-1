import java.util.Scanner;

class CharacterFrequency2 {

    // Method to find the unique characters in a string using charAt()
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] unique = new char[length];
        int uniqueCount = 0;

        // Loop through each character and check if it is unique using nested loop
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character is already added to the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (currentChar == unique[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the unique array
            if (isUnique) {
                unique[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to return only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method to find the frequency of characters in a string using unique characters
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop through the text to calculate frequency
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the count for the character
        }

        // Call the uniqueCharacters method to get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store them along with their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find character frequencies
        String[][] result = findFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String[] entry : result) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }
}
