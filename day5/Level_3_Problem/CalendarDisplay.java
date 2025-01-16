import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Taking month and year as input
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Call method to display the calendar for the given month and year
        displayCalendar(month, year);

        // Close the scanner
        input.close();
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if the year is a leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year condition
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Get the month name
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar header
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces to align the first day of the month correctly
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print 4 spaces
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print day with proper indentation
            System.out.printf("%3d ", day);

            // If it's Saturday, move to the next line
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Move to the next line after the last day of the month
        System.out.println();
    }
}
