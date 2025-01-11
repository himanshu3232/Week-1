import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
