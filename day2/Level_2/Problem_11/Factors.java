import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop through all numbers from 1 to number - 1
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
