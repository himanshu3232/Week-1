import java.lang.Math;
import java.util.Scanner;

public class StudentGradesString {

	 // Method to generate random marks for each student in three subjects
    public static int[][] generateMarks(int n) {
        // Creating a 2D array to store marks for each student
        int marks[][] = new int[n][3];
        
        // Generating random marks for each student
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int) (Math.random() * 90) + 10;  // Physics marks
            marks[i][1] = (int) (Math.random() * 90) + 10;  // Chemistry marks
            marks[i][2] = (int) (Math.random() * 90) + 10;  // Math marks
        }
        // Returning the generated marks
        return marks;
    }

    // Method to calculate total marks of each student
    public static int[] calculateTotal(int marks[][]) {
        // Array to store total marks for each student
        int[] total = new int[marks.length];
        
        // Calculating total marks by summing the marks of all subjects
        for (int i = 0; i < marks.length; i++) {
            total[i] = Math.round(marks[i][0] + marks[i][1] + marks[i][2]);
        }
        // Returning the total marks
        return total;
    }

    // Method to calculate percentage for each student
    public static int[] calculatePercentages(int[][] marks) {
        // Array to store percentages of each student
        int[] percentages = new int[marks.length];
        
        // Calculating percentage by averaging the marks of three subjects
        for (int i = 0; i < marks.length; i++) {
            percentages[i] = Math.round((marks[i][0] + marks[i][1] + marks[i][2]) / 3);
        }
        // Returning the calculated percentages
        return percentages;
    }

    // Method to calculate grades based on percentages
    public static char[] calculateGrades(int[] percentages) {
        // Array to store grades for each student
        char[] grades = new char[percentages.length];
        
        // Assigning grades based on percentage ranges
        for (int i = 0; i < percentages.length; i++) {
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';  // Rejected for failing
            }
        }
        // Returning the calculated grades
        return grades;
    }

    public static void main(String[] args) {
        // Creating scanner object to take input
        Scanner input = new Scanner(System.in);
        
        // Taking the number of students as input
        System.out.print("Enter number of students : ");
        int n = input.nextInt();
        
        // Generating random marks for the students
        int marks[][] = generateMarks(n);
        
        // Calculating percentages for the students
        int[] percentages = calculatePercentages(marks);

        // Calculating total marks for each student
        int[] total = calculateTotal(marks);
        
        // Calculating grades for each student based on percentages
        char[] grades = calculateGrades(percentages);
        
        // Printing the result in a tabular format
        System.out.println("Total number of students is " + n);
        System.out.println("Student physics chemistry maths total percentage grade");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "       " + marks[i][0] + "      " + marks[i][1] + "        " + marks[i][2] 
                + "    " + total[i] + "   " + percentages[i] + "         " + grades[i]);
        }
        // Closing the input
        input.close();
    }

   
}
