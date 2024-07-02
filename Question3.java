import java.util.Scanner;

public class Question3{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);

	int number = 1;

	while (number <= 10){

		if (number % 2 == 1)
		System.out.print(number );
		number++;
	}
  }
}