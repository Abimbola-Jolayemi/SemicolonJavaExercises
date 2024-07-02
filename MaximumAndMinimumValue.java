import java.util.Scanner;

public class MaximumAndMinimumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        boolean integerInput = true;

        while (integerInput) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                integerInput = false;
            }
        }

        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);

    }
}