import java.util.Scanner;

public class PostiveNegativeAndZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        System.out.println("Enter number of integer: ");
	int noOfTerms = input.nextInt();

        for (int i = 0; i < noOfTerms; i++) {
            System.out.print("Integers " + (i + 1) + ": ");
            int number = input.nextInt();

            if (number < 0) {
                countNegative++;
            } else if (number > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }

        System.out.println("Number of negative inputs: " + countNegative);
        System.out.println("Number of positive inputs: " + countPositive);
        System.out.println("Number of zero inputs: " + countZero);
    }
}