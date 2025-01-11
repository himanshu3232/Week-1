import java.util.*;

public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Take input
		int number = sc.nextInt();
		int result = 1;
		//Close Scanner
		sc.close();
		
		//Increment till you reach the number and multiply
		for(int i=2; i<=number; i++){
			result *= i;
		}
		System.out.println(result);
	}
}