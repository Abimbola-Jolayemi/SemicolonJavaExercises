import java.util.Scanner;

public cilass IntegerSquared {
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter first number: ");
	double integer1 = input.nextDouble();

	System.out.print("Enter second number: ");
        double integer2 = input.nextDouble();

	double firstIntegerSquared = Math.pow(integer1, 2);

	double secondIntegerSquared = Math.pow(integer2, 2);

	double addUpSquared = firstIntegerSquared + secondIntegerSquared;
	System.out.println("The sum of the Squared is:" + " " + addUpSquared);

	double minusSquared = firstIntegerSquared - secondIntegerSquared;
	System.out.print("The subtraction of their Squared is:" + " " + minusSquared);
  }

}