import java.util.*;
public class NullPointerExceptionDemo{
  public static void generateNullPointerException(){
   String text = null;
   
   System.out.println(text.length());
  }
 public static void handleNullPointerException(){
  String text = null;
  
  try{
    System.out.println(text.length());
	}
 catch(NullPointerException e){
     System.out.println(e.getMessage());
	 }
}

 
 public static void main(String args[]){
  System.out.println("Calling method to generate NullPointerException ");
  try{
     generateNullPointerException();
	}
   catch(NullPointerException e){
     System.out.println("caught an exception " + e);
	}
	
	System.out.println("Calling method to handle NullPointerException");
	handleNullPointerException();
 }
}