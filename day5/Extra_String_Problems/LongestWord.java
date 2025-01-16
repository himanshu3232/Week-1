import java.util.Scanner;

public class LongestWord {
	 // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");  // Split the sentence into words
        String longestWord = "";  // Variable to store the longest word

        for (String word : words) {
            // If the current word is longer than the longest one, update the longest word
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;  // Return the longest word
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the longest word
        System.out.println("The longest word is: " + longestWord);

        input.close();
    }

   
}
