import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();
        
        // Create a 2D array to store marks of each student in Physics, Chemistry, and Maths
        double[][] marks = new double[number][3];
        
        // Create an array to store percentage and grade of each student
        double[] percentages = new double[number];
        String[] grades = new String[number];
        
        // Input marks for each student in Physics, Chemistry, and Maths
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            double totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + " marks (out of 100): ");
                    marks[i][j] = scanner.nextDouble();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    } else {
                        break;
                    }
                }
                totalMarks += marks[i][j];
            }
            
            // Calculate percentage
            percentages[i] = (totalMarks / 300) * 100;
            
            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        // Display the marks, percentage, and grade for each student
        System.out.println("\nStudent Data (Marks, Percentage, Grade):");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}
