import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salaries and years of service for employees
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Input salary
            while (true) {
                System.out.print("Salary: ");
                salaries[i] = scanner.nextDouble();
                if (salaries[i] > 0) break;
                System.out.println("Invalid salary. Please enter a positive value.");
            }

            // Input years of service
            while (true) {
                System.out.print("Years of Service: ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service. Please enter a non-negative value.");
            }
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        scanner.close();
    }
}
