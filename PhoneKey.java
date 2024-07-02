import java.util.Scanner;

public class PhoneKey{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter a letter: ");
	String letter = input.nextLine();

	char key = letter.charAt(0);
	key = Character.toUpperCase(key);

	int number = 0;
	if (Character.isLetter(key)){
	   if (key >= 'W'){
	   	number = 9;
	   } else if (key >= 'T'){
	   	number = 8;
	   } else if (key >= 'P'){
	   	number = 7;
	   } else if (key >= 'M'){
	   	number = 6;
	   } else if (key >= 'J'){
	   	number = 5;
	   } else if (key >= 'G'){
	   	number = 4;
	   } else if (key >= 'D'){
	   	number = 3;
	   } else if (key >= 'A'){
	   	number = 2;
	   } System.out.println("The corresponding number is " + number);
	
	   } else {
		System.out.print(key + "is an invalid input");
		}
  }
}