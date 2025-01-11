import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        double weight = scanner.nextDouble();
		
		//take height in cm and convert it into m
		double height = scanner.nextDouble()/100;
		
		double bmi = weight/(height*height);
        
		if(bmi <= 18.4) System.out.println("Underweight");
		else if(bmi <= 18.5 && bmi >= 24.9)System.out.println("Normal");
		else if(bmi <= 25.0 && bmi >= 39.9)System.out.println("Overweight");
		else System.out.println("Obese");
		
        scanner.close();
    }
}
