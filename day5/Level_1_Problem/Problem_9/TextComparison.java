import java.util.Scanner;

public class TextComparison {

    // Method to convert text to uppercase using charAt() and ASCII values
    public static String customToUpperCase(String text) {
        StringBuilder upperText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert lowercase to uppercase by adjusting ASCII values
                currentChar = (char) (currentChar - 32);
            }
            upperText.append(currentChar);
        }
        
        return upperText.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();

        // Convert to uppercase using built-in method
        String builtInUpperCase = inputText.toUpperCase();
        
        // Convert to uppercase using custom method
        String customUpperCase = customToUpperCase(inputText);

        // Compare both results
        boolean isSame = compareStrings(builtInUpperCase, customUpperCase);
        
        // Display results
        System.out.println("Built-in uppercase: " + builtInUpperCase);
        System.out.println("Custom uppercase: " + customUpperCase);
        System.out.println("Are both uppercase results same? " + isSame);
        
        scanner.close();
    }
}
