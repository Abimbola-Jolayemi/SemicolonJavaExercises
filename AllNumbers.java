import java.util.Scanner;

public class AllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        // Calculate the sum
        int sum = num1 + num2 + num3;

        // Calculate the average
        double average = (num1 + num2 + num3) / 3;

        // Calculate the product
        int product = num1 * num2 * num3;

        // Determine the smallest number
        int smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        // Determine the largest number
        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}