import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define an array to hold the ages of 10 students
        int[] ages = new int[10];

        // Loop through the array to take input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            // Check if the age is negative
            if (ages[i] < 0) {
                System.out.println("Invalid age.");
            } else if (ages[i] >= 18) {
                // Check if the student is eligible to vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                // If the age is less than 18
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
