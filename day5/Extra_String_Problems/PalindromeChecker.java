import java.util.Scanner;

public class PalindromeChecker {
	 // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop to compare characters from start and end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome if characters don't match
            }
            start++;
            end--;
        }

        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        input.close();
    }

   
}
