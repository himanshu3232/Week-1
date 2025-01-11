import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Take user input
        System.out.print("Enter age: ");
        int age = input.nextInt();
		
		//Check if the age is eligible
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
		
		//Close Scanner
        input.close();
    }
}