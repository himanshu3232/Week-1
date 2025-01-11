import java.util.Scanner;
import java.util.Arrays;


//Class prints FizzBuzz for multiples of 15, Fizz for multiples of 3 and Buzz for multiples of 5, else it prints the number
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
		
		//Cache the result in the array
		String[] fizzBuzz = new String[number];
		
		//check if number is positive
		if(number>0){
			for(int i=1; i<=number; i++){
				if(i%15 == 0) fizzBuzz[i-1] = "FizzBuzz";
				else if(i%5 == 0)fizzBuzz[i-1] = "Buzz";
				else if(i%3 == 0)fizzBuzz[i-1] = "Fizz";
				else fizzBuzz[i-1] = String.valueOf(i);
			}
		}
		
		//Stream API to print Array items
		Arrays.stream(fizzBuzz).forEach(System.out::println);

        scanner.close();
    }
}
