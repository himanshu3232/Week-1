import java.util.Scanner;

public class ReplaceWord {
	   // Method to replace the given word with another word in the sentence using only normal string
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        String result = "";  // Initialize an empty string to store the modified sentence

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Loop through each word in the sentence
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToReplace)) {
                // If the word matches, append the replacement word to the result
                result += replacementWord;
            } else {
                // If the word does not match, append the original word to the result
                result += words[i];
            }

            // Add a space after each word, except the last word
            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;  // Return the modified sentence
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the sentence, the word to replace, and the replacement word
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        // Call the replaceWord method to replace the word
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }

 
}
