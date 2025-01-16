import java.util.Scanner;

	

public class MostFrequentCharacter {
	 // Method to find the most frequent character in the string
    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequentChar = str.charAt(0);

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count occurrences of the current character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Update the most frequent character if needed
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        scanner.close();
    }

   
}
