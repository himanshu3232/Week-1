import java.util.Scanner;

public class NumberCheck{
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  //Take input
  System.out.println("Enter the number");
  int number = input.nextInt();
  
  //Check if number is positive
  if(number > 0){
     System.out.println(number + " is positive number");
  }
  else if(number < 0){
     System.out.println(number + " is negative number");
  }
  //Check if it is zero
  else{
   System.out.println(number + " is Zero");
  }
  //Close Scanner
  input.close();
 }
}