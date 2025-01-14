import java.util.Scanner;

public class TextProcessing {

    // Method to convert text to lowercase using charAt() and ASCII values
    public static String customToLowerCase(String text) {
        StringBuilder lowerText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert uppercase to lowercase by adjusting ASCII values
                currentChar = (char) (currentChar + 32);
            }
            lowerText.append(currentChar);
        }
        
        return lowerText.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // Method to split the text into words and return their lengths in a 2D array
    public static String[][] splitTextIntoWordsAndLengths(String text) {
        String[] words = text.split("\\s+");  // Split by spaces
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];  // Store the word
            wordLengths[i][1] = String.valueOf(words[i].length());  // Store the word length
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();

        // Convert to lowercase using built-in method
        String builtInLowerCase = inputText.toLowerCase();
        
        // Convert to lowercase using custom method
        String customLowerCase = customToLowerCase(inputText);

        // Compare both results
        boolean isSame = compareStrings(builtInLowerCase, customLowerCase);
        
        // Display results
        System.out.println("Built-in lowercase: " + builtInLowerCase);
        System.out.println("Custom lowercase: " + customLowerCase);
        System.out.println("Are both lowercase results same? " + isSame);

        // Split text into words and return their lengths in a 2D array
        String[][] wordLengths = splitTextIntoWordsAndLengths(inputText);
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println("Word: " + wordLengths[i][0] + ", Length: " + wordLengths[i][1]);
        }

        scanner.close();
    }
}
