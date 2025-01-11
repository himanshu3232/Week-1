import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        int year = scanner.nextInt();

        // Check if the year is valid 
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
            return;
        }

        // Part 1: Using multiple if-else statements
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year (using multiple if-else).");
                } else {
                    System.out.println(year + " is not a Leap Year (using multiple if-else).");
                }
            } else {
                System.out.println(year + " is a Leap Year (using multiple if-else).");
            }
        } else {
            System.out.println(year + " is not a Leap Year (using multiple if-else).");
        }

        // Part 2: Using a single if statement with logical conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year (using single if).");
        } else {
            System.out.println(year + " is not a Leap Year (using single if).");
        }

        scanner.close();
    }
}
