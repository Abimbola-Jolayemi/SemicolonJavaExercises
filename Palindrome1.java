import java.util.Scanner;

public class Palindrome1{
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter a three digit number: ");
	int number = input.nextInt();

	if (number == 3){
	  System.out.print("Enter a valid three-digit number: ");
	} else {
          int digit1 = number % 10;
	  number = number / 10;

          int digit2 = number % 10;
          number = number / 10;

	  int digit3 = number % 10;

	if (digit1 == digit3) {
	  System.out.print("Number is a palindrome");
	} else {
	  System.out.print("It is not a palindrome");
	}
	}
	

  }
}