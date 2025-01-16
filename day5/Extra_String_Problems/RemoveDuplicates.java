import java.util.Scanner;

public class RemoveDuplicates {
	   // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        String result = "";  // String to store the result
        boolean[] seen = new boolean[256]; // Array to track characters we've seen

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character hasn't been seen before, add it to result
            if (!seen[c]) {
                result += c;  // Append the character to result string
                seen[c] = true;  // Mark the character as seen
            }
        }

        return result;  // Return the modified string
    }
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Call the method to remove duplicates
        String modifiedString = removeDuplicates(str);

        // Display the modified string
        System.out.println("Modified string: " + modifiedString);

        input.close();
    }

 
}
