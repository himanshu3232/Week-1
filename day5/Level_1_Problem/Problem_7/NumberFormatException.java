import java.util.*;
public class NumberFormatException{
  //create the method to generate the NumberFormatException 
 public static void generateNumberFormatException(String str){
   int number = Integer.parseInt(str); //convert number string to integer
   System.out.println(number);
   }
    
	//create the method to handle NumberFormatException
    public static void handleNumberFormatException(String str)
	{
	
	//try catch block to handle exception
	 try{
	  int number = Integer.parseInt(str);
      System.out.println(number);
     }
	 catch(Exception e){
	  System.out.println("Caught IllegalArgumentException: " + e.getMessage());
	 }
	}
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the string");
  String str = sc.nextLine().trim();
  
  System.out.println(" Call method to generate the NumberFormatException");
  try{
     generateNumberFormatException(str);
	 }
  catch(Exception e){
    System.out.println(e.getMessage());
	}
	finally{
	System.out.println("Caught the exception");
	}
    System.out.println("Call the method to handle the NumberFormatException");
	 generateNumberFormatException(str);
	}
}