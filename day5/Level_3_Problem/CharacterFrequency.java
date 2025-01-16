import java.util.Scanner;

class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII size)

        // Loop to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the count at the ASCII index of the character
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Loop to store the characters and their frequencies in the 2D array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the frequency of characters
        String[][] result = findFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String[] entry : result) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }
}
