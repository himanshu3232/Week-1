import java.util.Scanner;

public class Bmi {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store weight, height, and BMI for 10 members
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        // Input weight and height for each member
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for member " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for member " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();

            // Calculate BMI and store it
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // Determine BMI status
            statuses[i] = determineStatus(data[i][2]);
        }

        // Display the results
        System.out.printf("%n%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
