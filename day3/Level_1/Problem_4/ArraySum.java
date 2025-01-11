import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Initialize an array of 10 elements and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (0 or a negative number to stop):");

        while (true) {
            // Prompt user for input
            System.out.print("Enter number: ");
            double userInput = scanner.nextDouble();

            // Check if input is 0 or negative
            if (userInput <= 0) {
                break;
            }

            // Check if the array is full
            if (index == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

            // Store the input in the array and increment index
            numbers[index] = userInput;
            index++;
        }

        // Calculate the total
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Display the total
        System.out.println("\n\nThe total sum is: " + total);

        scanner.close();
    }
}
