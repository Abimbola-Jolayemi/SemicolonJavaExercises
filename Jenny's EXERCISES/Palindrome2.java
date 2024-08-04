import java.util.Scanner;

public class Palindrome2{
   public static void main (String []args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter a valid number: ");
	int number = input.nextInt();

	if(number == 3){
	  System.out.print("Enter a valid number:");
	} else {
	  int digit1 = number % 10;

	  int digit2 = number / 100;

	  
        if (digit1 == digit2){
 	  System.out.print("Number is definetely a palindrome");
	 } else {
	  System.out.print("Number is not a palindrome");
	  }
	}

  }

}