import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize the counter
        int i = 0;

        // Loop using while
        while (i <= number) {
            // Check for multiples of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if none of the above conditions are true
            else {
                System.out.println(i);
            }
            // Increment the counter
            i++;
        }

        scanner.close();
    }
}
