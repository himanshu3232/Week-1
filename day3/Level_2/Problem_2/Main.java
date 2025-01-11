import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter " + names[i] + "'s height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest friend
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }

        // Finding the tallest friend
        double tallestHeight = heights[0];
        String tallestFriend = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        // Displaying the results
        System.out.println("The youngest friend is " + youngestFriend + " with an age of " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with a height of " + tallestHeight + " cm.");
        
        // Close the scanner
        scanner.close();
    }
}
