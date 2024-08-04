import java.util.Scanner;

public class EvenAndOddFunction{
   public static void main(String []args){

	Scanner usersInput = new Scanner(System.in);

	MyFunction input = new MyFunction();

	System.out.print("Enter a number: ");
	int number = usersInput.nextInt();

	boolean isEven = input.isEven(number);

	if (isEven){
		System.out.print(aNumber + " is an even number");
	} else {
		System.out.print(aNumber + " is an odd number");
	}
   }
}