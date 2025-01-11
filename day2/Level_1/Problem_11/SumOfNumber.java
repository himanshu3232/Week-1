import java.util.Scanner;

public class SumOfNumber{
 public static void main(String args[]){
 //Take user input
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number");
  
  //store inputs
  double value = sc.nextDouble();
  double total = 0;
  
  check for value to be not equal to zero
  
  //infinite loop
  while(true){
   //check for condition
   if(value <= 0) break;
   total = total + value;
   System.out.println("Enter the number again");
   value = sc.nextDouble();
 }
 System.out.println("total of value is " + total);
 sc.close();
 }
}