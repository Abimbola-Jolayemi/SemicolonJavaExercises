import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizza{

   private static Scanner input = new Scanner(System.in);

   public static void main(String []args){

	PizzaFunction pizza = null;
	PizzaFunction.displayTable();
        int guests = getValidatedGuests();
        String pizzaType = getValidatedPizzaType();

        pizza = new PizzaFunction(guests, pizzaType);

	System.out.println();
        System.out.println("Number of boxes: " + pizza.getNoOfBoxes());
        System.out.println("Leftover slices: " + pizza.getLeftOver());
        System.out.println("Total cost: #" + pizza.getTotalCost());

   }

	private static int getValidatedGuests() {
        int guests = 0;
        while (true) {
            try {
                System.out.print("Enter the number of guests: ");
                guests = input.nextInt();

                if (guests > 0) {
                    input.nextLine();
                    break;
                } else {
                    System.out.println("Please try again. Enter a positive number for Number of Guests: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer for the number of guests.");
                input.next();
            }
        }
        return guests;
    }

	private static String getValidatedPizzaType() {

    		String pizzaType = "";
    		while (true) {
        		System.out.print("Enter pizza type: ");
        		pizzaType = input.nextLine().toLowerCase();

        		try {
            			if (PizzaFunction.isValidPizzaType(pizzaType)) {
                			break;
            			} else {
                			throw new IllegalArgumentException("Invalid pizza type. Please enter one of the following: Sapa size, Small Money, Big boys, Odogwu.");
            			}
        		} catch (IllegalArgumentException e) {
            			System.out.println(e.getMessage());
        		}
    		}
    		return pizzaType;
	}
}