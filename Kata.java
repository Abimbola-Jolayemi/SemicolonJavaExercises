import java.util.Scanner;
public class Kata{

	Scanner input = new Scanner (System.in);
   	
	public boolean isEven(){

    	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number % 2 == 0) 
		return true;
	else
		return false;

   }

	public boolean isPrimeNumber(){

	int count = 0;
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for (int num = 1; num <= number; num++){
		if (number % num == 0){
			count++;
		}
	}
		if (count == 2){
		  return true;
		} else {
		  return false;
		}
   }

	public int difference(int firstNumber, int secondNumber){
		if (firstNumber < secondNumber)
		   return secondNumber - firstNumber;
		else
		   return firstNumber - secondNumber;
   	}

	public float quotient(int firstNumber, int secondNumber){
		if (secondNumber == 0)
		   return 0;
		else
		return firstNumber / secondNumber;
	}
}