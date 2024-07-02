import java.util.Scanner;

public class Multiples{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	int number1Tripled = number1 * 3;

	int number2Doubled = number2 * 2;

	if (number1Tripled % number2Doubled == 0){
		System.out.print(number1Tripled + " is a multiple of " + number2Doubled);
	} else {
		System.out.print(number1Tripled + " is not a multiple of " + number2Doubled);
	}
  }
}