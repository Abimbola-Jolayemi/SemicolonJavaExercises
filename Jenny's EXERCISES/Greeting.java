import java.util.Scanner;

public class Greeting{
   public static void main(String []args){

	Scanner input = new Scanner (System.in);

	System.out.println("Welcome!!! Enter a number(0 or 1)");
	int number = input.nextInt();

	if (number == 1){
		System.out.println("Good Morning!!!");
	} else if (number == 0){
		System.out.println("Inna Kwana!!!");
	} else {
		System.out.println("Pls, enter a number(0 or 1)");
	}
   }
}