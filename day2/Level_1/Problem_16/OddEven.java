import java.util.*;

public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Take input
		int number = sc.nextInt();
		//Close Scanner
		sc.close();
		//Run loop
		for(int i=1; i<=number; i++){
			//Check for even
			if(i%2 == 0) System.out.println(i + " Is Even");
			//Check for odd
			else System.out.println(i + " Is Odd");
		}
	}
}