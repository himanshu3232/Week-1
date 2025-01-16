import java.util.*;

// Class to find smallest and largest string lengths from a text
public class SmallestLargestString {

    // Method to count the length of a string without using the String length() method
    public static int countLen(String val) {
        int count = 0;
        int i = 0;

        // Loop through each character in the string until an exception is thrown
        while (true) {
            try {
                char s;
                s = val.charAt(i); // Get character at index i
                count++;            // Increment count for each character
                i++;                // Move to the next character
            } catch (Exception e) {
                break; // Break the loop when an exception occurs (i.e., end of string)
            }
        }

        return count; // Return the total length of the string
    }

    // Method to split a string into words based on spaces (without using the String split() method)
    public static String[] splitz(String val) {
        int count = 0;

        // Count how many spaces are in the string to determine how many words there are
        for (int i = 0; i < countLen(val); i++) {
            if (val.charAt(i) == ' ') {
                count++;
            }
        }

        // Create an array to hold the words in the string
        String[] res = new String[count + 1];
        int index = 0;
        String ele = "";

        // Loop through each character in the string and split the words
        for (int i = 0; i < countLen(val); i++) {
            if (val.charAt(i) == ' ') {
                res[index++] = ele; // Add the word to the array
                ele = "";           // Reset word variable for next word
            } else {
                ele += val.charAt(i); // Add the character to the current word
            }
        }

        // Add the last word to the array
        res[index] = ele;

        return res; // Return the array of words
    }

    // Method to create a 2D array with each word and its corresponding length
    public static String[][] methodTable(String[] arr) {
        String res[][] = new String[arr.length][2];
        
        // Loop through each word in the array
        for (int i = 0; i < arr.length; i++) {
            res[i][0] = arr[i];            // Store the word
            int temp = countLen(arr[i]);   // Get the length of the word
            String val = String.valueOf(temp); // Convert the length to a string
            res[i][1] = val;               // Store the length of the word
        }
        return res; // Return the 2D array containing words and their lengths
    }

    // Method to find the smallest and largest string length from the 2D array
    public static int[] smallLarge(String[][] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int[] res = new int[2];

        // Loop through each word in the 2D array
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(arr[i][1]); // Get the length of the current word
            smallest = Math.min(smallest, temp);    // Update smallest if necessary
            largest = Math.max(largest, temp);      // Update largest if necessary
        }
        
        res[0] = smallest; // Store the smallest length
        res[1] = largest;  // Store the largest length
        return res;        // Return the array with the smallest and largest lengths
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter text
        System.out.println("Enter text");
        String text = sc.nextLine();

        // Split the input text into words
        String[] arr = splitz(text);

        // Create a 2D array with words and their lengths
        String[][] res = new String[arr.length][2];
        res = methodTable(arr);

        // Display the words and their lengths in tabular format
        System.out.println("Text\tlength");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i][0] + "\t" + Integer.parseInt(res[i][1])); // Display word and length
        }

        // Find the smallest and largest string lengths
        int[] smalllarge = smallLarge(res);
        System.out.println("smallest String : " + smalllarge[0]);
        System.out.println("largest String : " + smalllarge[1]);

        sc.close(); // Close the scanner
    }
}
