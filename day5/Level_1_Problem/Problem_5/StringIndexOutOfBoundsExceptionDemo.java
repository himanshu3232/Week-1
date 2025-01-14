import java.util.*;
public class StringIndexOutOfBoundsExceptionDemo{
	//create the method to generate StringIndexOutOfBoundsException
  public static void generateStringIndexOutOfBoundsException(String str){
   System.out.println(str.charAt(str.length()+1)); //Access the character greater than length of string
   }
   
   ////create the method to handle StringIndexOutOfBoundsException
 public static void handleStringIndexOutOfBoundsException(String str){
	 //Use try catch block to catch the exception or throw the exception
  try{
  System.out.println(str.charAt(str.length()+1));
  }
  catch(StringIndexOutOfBoundsException e){
   System.out.println(e.getMessage());
   }
  }
  
 public static void main(String args[]){
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter the string");
 
 //Take String from user
 String str = sc.nextLine().trim();
 
 System.out.println("call the methode to generate StringIndexOutOfBoundsException");
  try{
    generateStringIndexOutOfBoundsException(str);
	}
  catch(StringIndexOutOfBoundsException e){
    System.out.println("caught the exception " + e);
	}
  
  System.out.println("call the methode to handle StringIndexOutOfBoundsException");
   handleStringIndexOutOfBoundsException(str);
  }
 }