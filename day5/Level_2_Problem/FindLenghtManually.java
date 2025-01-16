import java.util.Scanner;

public class FindLenghtManually{
	
	//method to find length of the string
	public static int countWordLength(String str){
	int count =0;
	int i =0;

		try{
			while(true){
			if(str.charAt(i) != '\0'){
					count++; // count each character of the string
					i++;
			}
		}
		}catch(RuntimeException e){
			System.out.println(e); //runtime exception
		}
		return count; // return length of the string
	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = input.next();
	
		
		
		int lengthUserDefined = countWordLength(str); //returned length of the string
		int lengthBuiltIn = str.length(); // using built in method
		
		
		System.out.println("length of string using user defined method is "+ lengthUserDefined);
		System.out.println("length of string using built in method is "+ lengthBuiltIn);
		
	}
}