import java.util.Scanner;

public class CreditCardValidator{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);
	CreditCardValidatorFunction validity = new CreditCardValidatorFunction();

	System.out.print("Hello User, Kindly enter your name: ");
	String name = input.nextLine().toUpperCase();

	System.out.print("Welcome, " + name + ", enter card number: ");
	String cardNumber = input.nextLine();

	String[] cardValidity = validity.displayCardDetails(cardNumber);
	String cardType = cardValidity[0];
	String cardNo = cardValidity[1];
	String cardLength = cardValidity[2];
	String validityOfCard = cardValidity[3];

	System.out.println("Card Type: " + cardType);
	System.out.println("Card Number: " + cardNo);
	System.out.println("card Length: " + cardLength);
	System.out.println("Card Validity: " + validityOfCard);
   }
}