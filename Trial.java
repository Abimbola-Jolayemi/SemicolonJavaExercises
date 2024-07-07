import java.util.Scanner;

public class Trial{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int count = 0;
	for(int i = 1; i <= number / 2; i++){
		if (number % 2 == 0)
		   count++;
	}
	if (count * count == number){
		System.out.print("Number is an odd number");
	}
   }
}