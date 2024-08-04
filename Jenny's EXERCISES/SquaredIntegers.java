import java.util.Scanner;

public class SquaredIntegers {
  public static void main (String []args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	double firstInteger = input.nextDouble();

	System.out.print("Enter second integer: ");
	double secondInteger = input.nextDouble();

	double firstIntegerSquared = Math.pow(firstInteger, 2);
	System.out.printf("The square of the first integer: %.2f%n", firstIntegerSquared);

	double secondIntegerSquared = Math.pow(secondInteger, 2);
	System.out.printf("The square of the second integer: %.2f%n", secondIntegerSquared);

	double sum = firstIntegerSquared + secondIntegerSquared;
	System.out.printf("The sum of the squares: %.2f%n", sum);

	double difference = firstIntegerSquared - secondIntegerSquared;
	System.out.printf("The difference of the squares: %.2f", difference);
  }
}