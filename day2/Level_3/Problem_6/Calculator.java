import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Create variables for the two numbers and the operator
        double first, second;
        String op;

        // Get input values for first and second numbers
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        second = scanner.nextDouble();

        // Get the operator input
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

        // Perform operations using switch...case
        double result = 0;
        boolean validOperator = true;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                validOperator = false;
                break;
        }

        // Print the result if operator is valid
        if (validOperator) {
            System.out.println("Result: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
