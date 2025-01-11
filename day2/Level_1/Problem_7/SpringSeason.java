public class SpringSeason {
    public static void main(String args[]) {
		
		//Check this condition to avoid exception
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }
		
		//Parse String to integer
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
		//Check valid conditions
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}