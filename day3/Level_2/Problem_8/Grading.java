import java.util.Scanner;
import java.util.Arrays;

public class Grading {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Enter number of students
		System.out.println("Enter the number of Students");
		
		
		int attendance = scanner.nextInt();
		
		//Store marks here
		int[] physics = new int[attendance];
		int[] chemistry = new int[attendance];
		int[] maths = new int[attendance];
		int[] percentage = new int[attendance];
		char[] grade = new char[attendance];
		
		//Enter physics marks
		System.out.println("Enter physics marks");
		for(int i=0; i<attendance; i++){
			int marks = scanner.nextInt();
			
			//Check if marks is negative
			if(marks < 0){
				System.out.println("Exception: Negative marks not allowed!");
				i--;
				continue;
			}
			physics[i] = marks;
		}
		
		
		//Enter physics marks
		System.out.println("Enter chemistry marks");
		for(int i=0; i<attendance; i++){
			int marks = scanner.nextInt();
			
			//Check if marks is negative
			if(marks < 0){
				System.out.println("Exception: Negative marks not allowed!");
				i--;
				continue;
			}
			chemistry[i] = marks;
		}
		
		
		//Enter physics marks
		System.out.println("Enter maths marks");
		for(int i=0; i<attendance; i++){
			int marks = scanner.nextInt();
			
			//Check if marks is negative
			if(marks < 0){
				System.out.println("Exception: Negative marks not allowed!");
				i--;
				continue;
			}
			maths[i] = marks;
		}
		
		
		//find percentage
		for(int i=0; i<attendance; i++){
			percentage[i] = (maths[i] + chemistry[i] + physics[i])/3;
		}
		
		//find grade
		for(int i=0; i<attendance; i++){
			if(percentage[i] >= 80) grade[i] = 'A';
			else if(percentage[i] >= 70 && percentage[i] <= 79) grade[i] = 'B';
			else if(percentage[i] >= 60 && percentage[i] <= 69) grade[i] = 'C';
			else if(percentage[i] >= 50 && percentage[i] <= 59) grade[i] = 'D';
			else if(percentage[i] >= 40 && percentage[i] <= 49) grade[i] = 'E';
			else grade[i] = 'R';
		}
        
		
		//Print output
       // Arrays.stream(grade).forEach(System.out::println);
	   
	   for(char c : grade){
		   System.out.println(c);
	   }
        
        
        // Close the scanner
        scanner.close();
    }
}
