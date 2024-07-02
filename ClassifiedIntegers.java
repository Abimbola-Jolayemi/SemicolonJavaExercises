import java.util.Scanner;

public class ClassifiedIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        // Prompt the user to enter five numbers
        System.out.println("Enter five integers:");

        // Loop to read five numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Integers " + (i + 1) + ": ");
            int number = input.nextInt();

            // Classify the number
            if (number < 0) {
                countNegative++;
            } else if (number > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }

        // Display the results
        System.out.println("Number of negative inputs: " + countNegative);
        System.out.println("Number of positive inputs: " + countPositive);
        System.out.println("Number of zero inputs: " + countZero);
    }
}