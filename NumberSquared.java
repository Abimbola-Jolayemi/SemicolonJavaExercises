import java.util.Scanner;

public class NumberSquared{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number > 100){
		System.out.printf("%d%s%n", number, " is greater than 100");
	}if (number < 100){
		System.out.printf("%d%s%n", number, " is lesser than 100");
	}if (number == 100){
		System.out.printf("%d%s%n", number, " is equal to 100");
	}if (number != 100){
		System.out.printf("%d%s%n", number, " is not equal to 100");
	}

	double numberSquared = Math.pow(number, 2);

	if (numberSquared > 100){
		System.out.printf("%.2f%s%n", numberSquared, " is equal to 100");
	}if (numberSquared < 100){
		System.out.printf("%.2f%s%n", numberSquared, " is less than 100");
	}if (numberSquared == 100){
		System.out.printf("%.2f%s%n", numberSquared, " is equal to 100");
	}if (numberSquared != 100){
		System.out.printf("%.2f%s", numberSquared, " is not equal to 100");
	}

  }

}