import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop backwards from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if 'i' is a multiple of the entered number
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}