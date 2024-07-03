import java.util.Scanner;

public class PracticePrimeNumber{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int count = 0;
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for (int num = 1; num <= number; num++){
		if (number % num == 0){
			count++;
		}
	}
		if (count == 2){
		  System.out.print(number + " is a prime number");
		} else {
		  System.out.print(number + " is not a prime number");
		}
   }
}