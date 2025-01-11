import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		//Take user inputs
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
		
		//Check for condition where number1 is the smallest
        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        
		//close the scanner
        scanner.close();
    }
}