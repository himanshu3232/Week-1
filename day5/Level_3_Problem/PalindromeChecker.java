import java.util.Scanner;

class PalindromeChecker {

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop to compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters do not match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // Text is a palindrome
    }

    // Logic 2: Recursive method to compare characters from start and end
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters do not match, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call with incremented start and decremented end indices
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed string using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray(); // Convert string to character array
        char[] reversed = new char[original.length]; // Array for reversed string

        // Reverse the original string
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false; // If characters do not match, it's not a palindrome
            }
        }
        return true; // Both arrays are identical, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string to check if it's a palindrome:");
        String text = sc.nextLine();

        // Check palindrome using three different methods
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultCharArray = isPalindromeUsingCharArray(text);

        // Display results
        System.out.println("Using Iterative Method: " + resultIterative);
        System.out.println("Using Recursive Method: " + resultRecursive);
        System.out.println("Using Character Array Method: " + resultCharArray);
    }
}
