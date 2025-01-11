import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a positive integer (natural number): ");
        int n = scanner.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("The number is not a natural number. Please enter a positive integer.");
            return;
        }

        // Compute sum using formula
        int sumUsingFormula = n * (n + 1) / 2;

        // Compute sum using while loop
        int sumUsingLoop = 0;
        int i = 1;
        while (i <= n) {
            sumUsingLoop += i;
            i++;
        }

        // Compare results
        System.out.println("Sum using formula: " + sumUsingFormula);
        System.out.println("Sum using while loop: " + sumUsingLoop);

        if (sumUsingFormula == sumUsingLoop) {
            System.out.println("The results from both computations match!");
        } else {
            System.out.println("The results do not match. There might be an error in the computation.");
        }

        scanner.close();
    }
}
