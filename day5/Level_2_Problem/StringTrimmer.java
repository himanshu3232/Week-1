import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading and trailing spaces
    public static String trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the start index of the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the end index of the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return the substring between start and end indices
        return str.substring(start, end + 1);
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String str = input.nextLine();

        // Trim spaces using the custom method
        String trimmedByMethod = trimSpaces(str);

        // Trim spaces using the built-in trim() method
        String trimmedByBuiltIn = str.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedByMethod, trimmedByBuiltIn);

        // Display results
        System.out.println("Trimmed by custom method: '" + trimmedByMethod + "'");
        System.out.println("Trimmed by built-in method: '" + trimmedByBuiltIn + "'");
        System.out.println("Are the two results equal? " + areEqual);

        input.close();
    }
}
