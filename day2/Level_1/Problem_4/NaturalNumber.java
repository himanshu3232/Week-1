import java.util.*;

public class NaturalNumber{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 
 //User input
 System.out.println("Enter the natural number");
 int number = input.nextInt();
 
 //Apply formula
 int sum = (number * (number+1))/2;
 System.out.println("The sum of " + number + " natural numbers is "+ sum);
 
//Close scanner
 input.close();
 }
}