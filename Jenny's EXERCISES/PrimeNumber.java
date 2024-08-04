import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Enter a valid number!!!");
        } else if (number == 2) {
            System.out.println(number + " is a prime number");
        } else {
            int numberDivisor = 2;
            while (numberDivisor <= Math.sqrt(number)) {
                if (number % numberDivisor == 0) {
                    System.out.println(number + " is not a prime number");
                }
                numberDivisor++;
            }
            System.out.println(number + " is a prime number");
        }
    }
}
