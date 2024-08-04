import java.util.Scanner;

public class NoOfFactors{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int count = 0;
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for (int num = 2; num <= number; num++){
		if (number % num == 0){
			count++;
		}
	}
		System.out.print(count);
   }
}