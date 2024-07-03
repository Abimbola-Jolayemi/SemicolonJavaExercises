import java.util.Scanner;

public class Main{
   public static void main(String []args){

	Scanner input = new Scanner(System.in); 

	Kata kata = new Kata();

	System.out.println(kata.isEven());
	System.out.println(kata.isPrimeNumber());
	
	System.out.println("Enter first number to find difference: ");
	int number1 = input.nextInt();
	System.out.println("Enter second number: ");
	int number2 = input.nextInt();

	int diff = kata.difference(number1, number2);
	System.out.println("The difference is " + diff);

	System.out.println("Enter first number to find quotient: ");
	int num1 = input.nextInt();
	System.out.println("Enter second number: ");
	int num2 = input.nextInt();

	double quotientNumber = kata.quotient(num1, num2);
	System.out.printf("%.2f", quotientNumber);
   }

	
}