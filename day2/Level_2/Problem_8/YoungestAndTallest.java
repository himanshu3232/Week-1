import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the ages and heights of the 3 friends
        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int anthonyHeight = scanner.nextInt();

        // Find the youngest friend (smallest age)
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";

        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend (largest height)
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";

        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        // Close the scanner
        scanner.close();
    }
}