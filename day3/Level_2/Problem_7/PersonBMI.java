import java.util.Scanner;

public class PersonBMI {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        
        // Create a 2D array to store height, weight, and BMI for each person
        double[][] personData = new double[number][3];
        
        // Create an array to store weight status of each person
        String[] weightStatus = new String[number];
        
        // Input height and weight for each person and calculate BMI and status
        for (int i = 0; i < number; i++) {
            double height = 0;
            double weight = 0;
            
            // Ensure the height and weight are positive values
            while (height <= 0) {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            }

            while (weight <= 0) {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            }
            
            // Calculate BMI: BMI = weight / (height * height)
            double bmi = weight / (height * height);
            personData[i][0] = height;  // Store height
            personData[i][1] = weight;  // Store weight
            personData[i][2] = bmi;     // Store BMI
            
            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        // Display the height, weight, BMI, and status of each person
        System.out.println("\nPerson Data (Height, Weight, BMI, Weight Status):");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}
