import java.util.Scanner;

public class CompareIntegers {
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	System.out.print("Enter third number: ");
	int number3 = input.nextInt();

	System.out.print("Enter fourth number: ");
	int number4 = input.nextInt();

	System.out.print("Enter fifth number: ");
	int number5 = input.nextInt();

	if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
 		System.out.printf("%d%s%n", number1, " is the highest.");
	}

	if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
 		System.out.printf("%d%s%n", number2, " is the highest.");
	}

	if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
 		System.out.printf("%d%s%n", number3, " is the highest.");
	}

	if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
 		System.out.printf("%d%s%n", number4, " is the highest.");
	}

	if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
 		System.out.printf("%d%s%n", number5, " is the highest.");
	}

	

	if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
 		System.out.printf("%d%s%n", number1, " is the lowest.");
	}

	if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
 		System.out.printf("%d%s%n", number2, " is the lowest.");
	}

	if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
 		System.out.printf("%d%s%n", number3, " is the lowest.");
	}

	if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {
 		System.out.printf("%d%s%n", number4, " is the lowest.");
	}

	if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4) {
 		System.out.printf("%d%s%n", number5, " is the lowest.");
	}
  }
}