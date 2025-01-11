import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons in the team: ");
        int number = scanner.nextInt();
        
        // Create arrays to store height, weight, BMI, and weight status for each person
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];
        
        // Input height and weight for each person
        for (int i = 0; i < number; i++) {
            // Input height
            while (true) {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height[i] = scanner.nextDouble();
                if (height[i] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                } else {
                    break;
                }
            }
            
            // Input weight
            while (true) {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight[i] = scanner.nextDouble();
                if (weight[i] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                } else {
                    break;
                }
            }
            
            // Calculate BMI: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\nTeam Data (Height, Weight, BMI, Weight Status):");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}
