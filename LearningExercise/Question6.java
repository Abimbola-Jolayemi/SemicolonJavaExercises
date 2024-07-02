import java.util.Scanner;

public class Question6{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int number = input.nextInt();

	if (number % 5 == 0 && number % 3 == 0){
		System.out.println(number + " is divisible by 5 and 3");
	}
   }
}