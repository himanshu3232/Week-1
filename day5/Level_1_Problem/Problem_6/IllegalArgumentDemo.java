import java.util.Scanner;

public class IllegalArgumentDemo {
	public static void main(String[] args){
		try{
			getSubstring("abc", 100, 5);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	
	//Throw IllegalArgumentException if argument is not valid
	private static String getSubstring(String s, int start, int end) throws IllegalArgumentException{
		if(start>end) throw new IllegalArgumentException("start index is greater than end index");
		
		return s.substring(start,end);
	}
}
