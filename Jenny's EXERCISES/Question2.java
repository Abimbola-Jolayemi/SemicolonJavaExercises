import java.util.Scanner;

public class Question2{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);

	int number = 1;

	while (number <= 10){

		if (number % 2 == 0)
		System.out.print(number );
		number++;
	}
  }
}