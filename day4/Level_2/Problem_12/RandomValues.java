import java.util.Scanner;
import java.util.Random;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + random.nextInt(9000); // Generate 4-digit number
        }
        return randomNumbers;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of random values to generate: ");
        int size = scanner.nextInt();

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(randomNumbers);

        System.out.printf("%nAverage: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);

        scanner.close();
    }
}
