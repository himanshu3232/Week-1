import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacterType(char ch) {
        
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }

        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacterType(ch);

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount }; 
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

     
        int[] counts = countVowelsAndConsonants(input);

      
        System.out.println("\nResults:");
        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);

        scanner.close();
    }
}
