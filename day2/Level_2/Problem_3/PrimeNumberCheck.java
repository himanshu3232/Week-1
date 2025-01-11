import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = scanner.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        // Variable to track if the number is prime
        boolean isPrime = true;

        // Check divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false; // Divisible by a number other than 1 and itself
                break; // Exit the loop
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
