import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Take input for the substring to count
        System.out.print("Enter the substring: ");
        String substring = input.nextLine();

        // Call the method to count occurrences of the substring
        int count = 0;
        int index = 0;

        // Loop through the string to find the substring occurrences
        for (int i = 0; i <= str.length() - substring.length(); i++) {
            if (str.substring(i, i + substring.length()).equals(substring)) {
                count++; // Increment count if the substring matches
            }
        }

        // Display the count of occurrences
        System.out.println("The substring \"" + substring + "\" appears " + count + " times.");

        input.close();
    }
}
