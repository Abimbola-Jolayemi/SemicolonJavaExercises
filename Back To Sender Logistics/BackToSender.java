import java.util.Scanner;
import java.util.InputMismatchException;

public class BackToSender{

   static Scanner scanner = new Scanner(System.in);

   public static void main (String []args){

	int ridersWage = deliveryInput();
	System.out.print("The wage of the rider is: " + ridersWage);
   }

	private static int validateInput(){
	   int deliveryNumber = 0;
	   boolean isValid = false;
		while(!isValid){
			System.out.println("Enter colletion rate of successful delivery: ");
			
			try{
			   int number = scanner.nextInt();
				if(number < 0){
			   		System.out.print("Enter a valid input!!!");
				} else {
					deliveryNumber =  number;
				   isValid = true;
				}
			} catch (InputMismatchException e){
				System.out.print("Invalid input!!!. Enter a valid input!!!");
				scanner.next();
			}
		} 

		return deliveryNumber;
		
	}


	public static int deliveryInput(){

		int deliveryNumber = validateInput();
		int result;
				if (deliveryNumber < 50)
					result = deliveryNumber * 160 + 5000;
				else if (deliveryNumber <= 59 && deliveryNumber >= 50)
					result = deliveryNumber * 200 + 5000;
				else if (deliveryNumber <= 69 && deliveryNumber >= 60)
					result = deliveryNumber * 250 + 5000;
				else if (deliveryNumber >= 70)
					result = deliveryNumber * 500 + 5000;
				else
					result = 0;

		return result;

	}
}