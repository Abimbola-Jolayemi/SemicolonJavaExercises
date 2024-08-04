import java.util.Scanner;

public class Palindrome{
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	//Allow user to enter a 3-digit number
	System.out.print("Enter a 3-digit number: ");
	int number = input.nextInt();

	//Check if number is a 3-digit number
	if (number == 3){
	  System.out.print ("Enter a valid number: ");
	} else {

	//Extract each digits from the number
	  int num1 = number % 10;
	  number = number / 10;

	  int num2 = number % 10;
	  number = number / 10;

	  int num3 = number;

	//Display true first number is equal to the last digit
	  if (num1 == num3){
		System.out.print("It is a palindrome");
	  } else{
		System.out.print("Not a palindrome");
	  }
	}
  }
}