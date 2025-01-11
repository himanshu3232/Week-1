import java.util.*;

public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Take input
		int number = sc.nextInt();
		int result = 1;
		//Close Scanner
		sc.close();
		//Find the factorial using for loop
		for(int i=2; i<=number; i++){
			result *= i;
		}
		System.out.println(result);
	}
}
