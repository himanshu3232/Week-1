import java.util.Scanner;

public class LexicographicalCompare {

	 // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        // Compare each character of both strings
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return -1; // str1 is lexicographically smaller
            } else if (char1 > char2) {
                return 1; // str2 is lexicographically smaller
            }
        }

        // If one string is a prefix of the other, the shorter one is lexicographically smaller
        if (length1 < length2) {
            return -1; // str1 is lexicographically smaller
        } else if (length1 > length2) {
            return 1; // str2 is lexicographically smaller
        }

        return 0; // Both strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for two strings
        System.out.print("String 1: ");
        String str1 = scanner.nextLine();

        System.out.print("String 2: ");
        String str2 = scanner.nextLine();

        // Call the method to compare the strings lexicographically
        int result = compareStringsLexicographically(str1, str2);

        // Display the comparison result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }

        scanner.close();
    }

   
}
