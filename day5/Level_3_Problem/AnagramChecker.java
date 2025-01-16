import java.util.Scanner;

class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of both texts are equal
        if (text1.length() != text2.length()) {
            return false; // If lengths are not equal, they can't be anagrams
        }

        // Arrays to store the frequency of characters in both texts
        int[] frequency1 = new int[256]; // Array to store frequency for text1
        int[] frequency2 = new int[256]; // Array to store frequency for text2

        // Loop through both texts to calculate the frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; // Increment frequency for text1
            frequency2[text2.charAt(i)]++; // Increment frequency for text2
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, not anagrams
            }
        }

        return true; // If frequencies match, they are anagrams
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the two strings
        System.out.println("Enter the first text:");
        String text1 = sc.nextLine();
        System.out.println("Enter the second text:");
        String text2 = sc.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
