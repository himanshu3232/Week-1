import java.util.Scanner;

public class StringCharacterComparison {

    // Method to return the characters of a string without using toCharArray()
    public static char[] customCharArray(String text) {
        char[] charArray = new char[text.length()];
        
        // Iterate over each character in the string and store it in the charArray
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        
        return charArray;
    }

    // Method to compare two char arrays and return a boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;  // If the lengths are different, arrays are not equal
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;  // If any character doesn't match, arrays are not equal
            }
        }
        
        return true;  // If all characters match, arrays are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the text:");
        String inputText = scanner.next();  // Read a single word input
        
        // Call the user-defined method to get characters as a char array
        char[] customCharArrayResult = customCharArray(inputText);
        
        // Use the built-in toCharArray() method to get characters as a char array
        char[] builtInCharArrayResult = inputText.toCharArray();
        
        // Compare the two char arrays
        boolean isSame = compareCharArrays(customCharArrayResult, builtInCharArrayResult);
        
        // Display results
        System.out.println("Custom method character array: ");
        for (char c : customCharArrayResult) {
            System.out.print(c + " ");
        }
        
        System.out.println("\nBuilt-in method character array: ");
        for (char c : builtInCharArrayResult) {
            System.out.print(c + " ");
        }
        
        System.out.println("\nAre both character arrays the same? " + isSame);
        
        scanner.close();
    }
}
