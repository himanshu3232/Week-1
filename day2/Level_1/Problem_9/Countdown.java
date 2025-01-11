import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Take the user input
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();
		
		//Check if counter is greater than 0
        for(int i = counter ; i >= 1; i--){
            System.out.println(counter);
            counter--;
            
        }

        System.out.println("Launch!");
        input.close();
    }
}