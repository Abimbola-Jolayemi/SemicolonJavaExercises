import java.util.Scanner;

public class ConditionalOperator{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number 0 or 1: ");
	int number = input.nextInt();

	System.out.print(number == 0 ? "Inna Kwana" : "Good Morning");
   }
}