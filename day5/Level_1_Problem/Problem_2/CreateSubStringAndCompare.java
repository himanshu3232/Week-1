import java.util.*;
public class CreateSubStringAndCompare{
	//Method to create substring using charAt
	public static String createSubStringUsingCharAt(String str , int start, int end) {
		
		if(start < 0 || end > str.length()){
			//Throw expection if start is negative and the end is greater than string length
		  throw new IllegalArgumentException("metion correct start or end");
		  }
		StringBuilder sb = new StringBuilder();
		
		for(int i=start; i<end; i++){
			sb.append(str.charAt(i)); //Add each character to string builder
			}
		return sb.toString();
	}
	
	//Compare two substring that generate by charAt and substring()
	public static boolean CompareTwoString(String subStringUsingCharAt , String subStringUsingSubString){
	 if( subStringUsingCharAt.length() != subStringUsingSubString.length() ){
	      return false; //String of different length can't be equal
		}
	 int index =0 ;
	 while(index < subStringUsingCharAt.length()){
	   if(subStringUsingCharAt.charAt(index) != subStringUsingSubString.charAt(index)){
	      return false;
		}
	   index++;
	  }
	 return true;
	}
	
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string " );
  //Take string from user
  String str = sc.nextLine().trim();
  
  System.out.println("Enter the start index");
  //Take start index from user
  int start = sc.nextInt();
  System.out.println("Enter the end index");
  //Take end index from user
  int end = sc.nextInt();
  
  String subStringUsingCharAt = createSubStringUsingCharAt(str , start , end);
  String subStringUsingSubString = str.substring(start , end);
  
  boolean resultOfCompare = CompareTwoString(subStringUsingCharAt , subStringUsingSubString);
  
  if(resultOfCompare){ 
   //Display result
   System.out.println(" The two subString " + subStringUsingCharAt + " and " + subStringUsingSubString + " are equal " );
   }
   else{
     System.out.println(" The two subString " + subStringUsingCharAt + " and " + subStringUsingSubString + " are not equal " );
	 }
	}
}