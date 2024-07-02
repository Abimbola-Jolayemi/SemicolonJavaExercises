import java.util.Scanner;

public class NumberOccurence{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	int max = Integer.MIN_VALUE;
	int count = 0;

	System.out.print("Enter integers (end with 0): ");

	while (true){
		int number = input.nextInt();

		if (number == 0) {
		  break;
		} else if (number > max){
		  max = number;
		  count = 1;
		} else if (number == max) {
		  count++;
		}
	}

		if (max != Integer.MIN_VALUE){
		  System.out.println("The largest number is " + max);
		  System.out.println("The occurence of the largest number is " + count);
		} else {
		  System.out.print("No numbers are entered except 0");
		}
  }
}