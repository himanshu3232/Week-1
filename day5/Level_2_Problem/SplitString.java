import java.util.Scanner;

class SplitMethod {

    // Custom method to calculate the length of a string without using the built-in length() method
    public static int countLen(String val) {
        int count = 0; // Counter for length
        int i = 0;

        // Iterate through the string until an exception occurs (end of string)
        while (true) {
            try {
                char s = val.charAt(i); // Access each character
                count++;
                i++;
            } catch (Exception e) {
                break; // Break when index is out of bounds
            }
        }

        return count;
    }

    // Custom method to split a string into words based on spaces
    public static String[] splitz(String val) {
        int count = 0;

        // Count the number of spaces to determine the size of the result array
        for (int i = 0; i < countLen(val); i++) {
            if (val.charAt(i) == ' ') {
                count++;
            }
        }

        String[] res = new String[count + 1]; // Initialize the result array
        int index = 0;
        String ele = "";

        // Extract words and store them in the result array
        for (int i = 0; i < countLen(val); i++) {
            if (val.charAt(i) == ' ') {
                res[index++] = ele; // Add the current word
                ele = "";           // Reset for the next word
            } else {
                ele += val.charAt(i); // Accumulate characters
            }
        }

        res[index] = ele; // Add the last word
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:"); // Prompt the user for input
        String text = sc.nextLine();

        // Split the input text into words using the custom method
        String[] arr = splitz(text);

        // Print the split words
        System.out.println("Split words:");
        for (String ele : arr) {
            System.out.println(ele);
        }
    }
}
