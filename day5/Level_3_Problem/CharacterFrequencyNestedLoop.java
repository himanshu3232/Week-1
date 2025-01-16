import java.util.Scanner;

class CharacterFrequencyNestedLoop {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();  // Convert the string to a character array
        int length = chars.length;
        int[] frequency = new int[length];  // Array to store the frequency of each character
        String[] result = new String[length]; // Array to store characters and their frequencies
        
        // Outer loop iterates over each character
        for (int i = 0; i < length; i++) {
            // Initialize frequency to 1 for each character
            if (chars[i] != '0') {
                frequency[i] = 1;
                // Inner loop checks for duplicates
                for (int j = i + 1; j < length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;  // Increment the frequency for duplicates
                        chars[j] = '0';   // Mark duplicate character to avoid recounting
                    }
                }
            }
        }
        
        // Store characters and their frequencies in the result array
        int resultIndex = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[resultIndex] = chars[i] + ":" + frequency[i];
                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the character frequencies
        String[] result = findFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String entry : result) {
            if (entry != null) {
                System.out.println(entry); // Display character and its frequency
            }
        }
    }
}
