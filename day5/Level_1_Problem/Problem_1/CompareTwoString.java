import java.util.*;
public class CompareTwoString{
   
   //method to compare character of both strings
   public static boolean CompareStringByCompareMethod(String string1, String string2){
   
   //check if length of both string are same or not
   if(string1.length() != string2.length()){
    return false;
	}
	int index = 0;
	//using while loop to comapre string
	while(index < string1.length()){
	  if(string1.charAt(index) != string2.charAt(index)){
	     return false;
		 }
		 index ++;
		}
	return true;
 }
  
 // main function
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the first string");
 
 //Take the  first string from user
 String string1 = sc.nextLine().trim();
 System.out.println("Enter the second string");
 //Take the  second string from user
 String string2 = sc.nextLine().trim();
 
 //store result of CompareStringByCompareMethod method
 boolean resultOfCompare = CompareStringByCompareMethod(string1,string2);
 
 boolean resultOfEqual = string1.equals(string2);
  
 if(resultOfCompare){
 System.out.println("The String1 : " + string1 + " and the String2 : " + string2 + " are same using compare two string");
 }
 else if(resultOfEqual){
 System.out.println("The String1 : " + string1 + " and the String2 : " + string2 + " are same using equalTo method two string");
 }
 else{
 System.out.println("The String1 : " + string1 + " and the String2 : " + string2 + " are not same");
 }
}
}
  