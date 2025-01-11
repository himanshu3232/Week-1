import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define an array to hold 5 numbers
        int[] numbers = new int[5];

        // Take user input to store in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check the numbers
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                // If positive, check if it is even or odd
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                // If negative
                System.out.println(number + " is negative.");
            } else {
                // If zero
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner
        scanner.close();
    }
}
