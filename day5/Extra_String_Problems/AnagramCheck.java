import java.util.Scanner;

public class AnagramCheck {
	 // Method to check if two strings are anagrams
	   public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Create an array to store character counts
        int[] charCount = new int[26]; // Assuming only alphabet characters

        // Iterate through the first string and count characters
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }

        // Iterate through the second string and decrement character counts
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        // If all counts are zero, the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two strings as input from the user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Call the method to check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

   
}
