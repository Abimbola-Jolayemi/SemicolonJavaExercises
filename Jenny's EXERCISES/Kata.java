import java.util.Scanner;
public class Kata{

	Scanner input = new Scanner (System.in);
   	
	public boolean isEven(int number){
	if (number % 2 == 0) 
		return true;
	else
		return false;

   }

	public boolean isPrimeNumber(int number){

	int count = 0;

	for (int num = 2; num <= number; num++){
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

	public boolean isPerfectSquare(int number){
		
		for (int i = 1; i <= number; i++){
			if (i * i == number){
			   return true;
			}
		}
		   	   return false;	
	}

	public void factorsOfNumbers(int number){

		for (int factor = 1; factor <= number; factor++){
			if(number % factor == 0)
			   System.out.println(factor);
		}
	}

	public boolean isPalindrome(int number){

		int digit1 = number % 10;
		number = number / 10;

		int digit2 = number % 10;
		number = number / 10;

		int digit3 = number % 10;
		number = number / 10;

		int digit4 = number % 10;
		number = number / 10;

		int digit5 = number;

		if (digit1 == digit5 && digit2 == digit4)
			return true;
		else
			return false;
	}

	public long factorial(int number){
		
		long factorial = 1;

		for (int index = 1; index <= number; index++){
			factorial = factorial * index;
		}
		return factorial;
	}

	
}