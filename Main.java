import java.util.Scanner;

public class Main{
   public static void main(String []args){

	Scanner input = new Scanner(System.in); 

	Kata kata = new Kata();

	System.out.println("Enter a number to check if it is an even number: ");
	int number = input.nextInt();
	boolean isNumberEven = kata.isEven(number);
	System.out.println(isNumberEven);	


	System.out.println("Enter a number to check if it is a prime number: ");
	int num = input.nextInt();
	boolean isNumberAPrimeNumber = kata.isPrimeNumber(number);
	System.out.println(isNumberAPrimeNumber);
	

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
	System.out.printf("%.2f%n", quotientNumber);

	System.out.println("Enter a number to check if it is a perfect square: ");
	int numberSqr = input.nextInt();
	boolean checkNumberSqr = kata.isPerfectSquare(numberSqr);
	System.out.println(checkNumberSqr);

	System.out.print("Enter a number to print its factors: ");
	int numberFactor = input.nextInt();

	kata.factorsOfNumbers(numberFactor);
	

	System.out.println("Enter a five-digit number to check if it is a palindrome");
	int fiveDigit = input.nextInt();

	boolean isFiveDigitPalindrome = kata.isPalindrome(fiveDigit);
	System.out.println(isFiveDigitPalindrome);

	System.out.print("Enter a number to check its factorial: ");
	int numberFactorial = input.nextInt();

	long printFactorial = kata.factorial(numberFactorial);
	System.out.print(printFactorial);
	
   }

	
}