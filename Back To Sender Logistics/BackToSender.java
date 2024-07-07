import java.util.Scanner;

public class BackToSender{
   public static void main (String []args){

	Scanner scanner = new Scanner(System.in);
	Back2SenderFunction input = new Back2SenderFunction();

	System.out.println("Enter collection rate of successful delivery");
	int deliveryNumber = scanner.nextInt();

	int ridersWage = input.deliveryInput(deliveryNumber);
	System.out.print("The wage of the rider is: " + ridersWage);
   }
}