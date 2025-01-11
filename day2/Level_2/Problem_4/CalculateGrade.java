import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a positive integer: ");
        int physics = scanner.nextInt();
		int chemistry = scanner.nextInt();
		int maths = scanner.nextInt();
        
		//find total
		int totalMarks = physics + chemistry + maths;
		
		//find average Marks
		int averageMarks = totalMarks/3;
		int percentage = averageMarks;
		
		//check for condition
		if(pecentage >= 80) System.out.println("Grade A");
		else if(percentage >=70 && percentage <= 79) System.out.println("Grade B");
		else if(percentage >=60 && percentage <= 69) System.out.println("Grade C");
		else if(percentage >=50 && percentage <= 59) System.out.println("Grade D");
		else if(percentage >=40 && percentage <= 49) System.out.println("Grade E");
		else System.out.println("Grade F");
		
        scanner.close();
    }
}
