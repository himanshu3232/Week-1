import java.util.Scanner;

class UniqueCharacters {

    // Method to find the length of a string without using the length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access characters until an exception occurs
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of the string reached
        }
        return count;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); // Get the length of the string
        char[] unique = new char[length]; // Temporary array to store unique characters
        int uniqueCount = 0;

        // Outer loop to check each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character is already added to the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (current == unique[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the unique array
            if (isUnique) {
                unique[uniqueCount++] = current;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the result
        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            System.out.printf("%c ", c);
        }
        System.out.println();
    }
}
