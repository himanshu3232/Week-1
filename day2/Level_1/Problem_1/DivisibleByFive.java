import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Take User Input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//Check if number is divisible by 5
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
		
		//Close the Scanner
        input.close();
    }
}