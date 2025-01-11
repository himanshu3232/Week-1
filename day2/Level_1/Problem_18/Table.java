import java.util.*;

public class Table {
	public static void main(String[] args){
		//Take user input
		int number = new Scanner(System.in).nextInt();
		//Print table
		for(int i=1; i<=10; i++){
			System.out.println(number*i);
		}
	}
}