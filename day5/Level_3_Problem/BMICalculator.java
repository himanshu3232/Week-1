import java.util.Scanner;

class BMICalculator {

    // Method to calculate BMI and determine status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4]; // 2D array to store height, weight, BMI, and status

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];  // Get weight in kg
            double heightInCm = data[i][1];  // Get height in cm
            double heightInMeters = heightInCm / 100; // Convert height to meters

            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to two decimal places

            // Determine status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            // Store height, weight, BMI, and status in the result array
            result[i][0] = String.valueOf(heightInCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result; // Return the result array
    }

    // Method to display the results using simple println
    public static void displayResults(String[][] data) {
        System.out.println("Height(cm)  Weight(kg)  BMI       Status");
        System.out.println("---------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "        " + data[i][1] + "       " + data[i][2] + "      " + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] heightWeightData = new double[10][2]; // 2D array to store height and weight

        // Take user inputs
        System.out.println("Enter the height (in cm) and weight (in kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:%n", i + 1);
            System.out.print("Height (cm): ");
            heightWeightData[i][1] = sc.nextDouble(); // Store height in column 1
            System.out.print("Weight (kg): ");
            heightWeightData[i][0] = sc.nextDouble(); // Store weight in column 0
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(heightWeightData);

        System.out.println("\nResults:");
        displayResults(bmiResults);
    }
}
