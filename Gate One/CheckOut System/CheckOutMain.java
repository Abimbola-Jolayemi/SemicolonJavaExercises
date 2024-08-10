import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOutMain{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);
	
	LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm:ss a");
        String formattedDate = now.format(formatter);

	ArrayList<CheckOutFunction> cart = new ArrayList<>();
	String response = "yes";

	System.out.print("What is the customer's name: ");
		String nameOfCustomer = input.nextLine().toUpperCase();

	double total = 0;
	while(response.equals("yes")){
		System.out.print("What did the customer purchase?: ");
		String purchase = input.nextLine().toUpperCase();

		System.out.print("How many pieces?: ");
		int quantity = input.nextInt();

		System.out.print("How much per unit?: ");
		double price = input.nextDouble();

		input.nextLine();

		double pricePerProduct = price * quantity;
		CheckOutFunction checkout = new CheckOutFunction(purchase, quantity, price, pricePerProduct);
		total += pricePerProduct;

		cart.add(checkout);
		
		System.out.print("Do you want to add more items? (Yes/No): ");
		response = input.nextLine().toLowerCase();
	}

	System.out.print("What is your name?: ");
	String nameOfCashier = input.nextLine().toUpperCase();

	System.out.print("How much discount will the customer get?: ");
	double discount = input.nextDouble();
	
	double vat = 17.5;

	CheckOutFunction checkout = new CheckOutFunction("", 0, 0, 0);

	double discountedPrice = checkout.computeDiscountOnPrice(discount, total);
	double vatPrice = checkout.computeVATOnPrice(vat, total);

	double billsTotal = checkout.computeBillsTotal(discount, vat, total);

	System.out.println();

	System.out.println("SEMICOLON STORES" + "\nMAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
	System.out.println("TEL: 03293828343");
	System.out.println("Date and Time: " + formattedDate);
	System.out.println("Cashier: " + nameOfCashier);
	System.out.println("Customer's name: " + nameOfCustomer);
	System.out.println("===============================================================================");

	System.out.printf("%15s%15s%15s%15s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL(NGN)");

	System.out.println("-------------------------------------------------------------------------------");

	System.out.println();

	for(CheckOutFunction element: cart){
		System.out.printf("%15s%15d%15.2f%15.2f%n", element.getProductName(), element.getProductQuantity(), element.getProductPrice(), element.computeTotalPricePerProduct());
	}

	System.out.println("-------------------------------------------------------------------------------");
	System.out.println();

	System.out.printf("%45s%.2f%n", "Sub-total: ", total);
	System.out.printf("%45s%.2f%n", "Discount: ", discountedPrice);
	System.out.printf("%45s%.2f%n", "VAT: ",  vatPrice);

	System.out.println("===============================================================================");
	System.out.printf("%45s%.2f%n", "Bills total: ", billsTotal);
	System.out.println("===============================================================================");

	System.out.println("===============================================================================");
	System.out.printf("%45s%.2f%n", "THIS IS NOT A RECEIPT, KINDLY PAY ", billsTotal);
	System.out.println("===============================================================================");

	System.out.println();
	System.out.println();
	
	System.out.print("How did the customer give to you?: ");
	double amountPaid = input.nextDouble();

	double balance = checkout.computeBalance(amountPaid, billsTotal);
	
	System.out.println();
	System.out.println();

	System.out.println("SEMICOLON STORES" + "\nMAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
	System.out.println("TEL: 03293828343");
	System.out.println("Date and Time: " + formattedDate);
	System.out.println("Cashier: " + nameOfCashier);
	System.out.println("Customer's name: " + nameOfCustomer);
	System.out.println("===============================================================================");

	System.out.printf("%15s%15s%15s%15s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL(NGN)");

	System.out.println("-------------------------------------------------------------------------------");

	System.out.println();

	for(CheckOutFunction element: cart){
		System.out.printf("%15s%15d%15.2f%15.2f%n", element.getProductName(), element.getProductQuantity(), element.getProductPrice(), element.computeTotalPricePerProduct());
	}

	System.out.println("-------------------------------------------------------------------------------");
	System.out.println();

	System.out.printf("%45s%.2f%n", "Sub-total: ", total);
	System.out.printf("%45s%.2f%n", "Discount: ", discountedPrice);
	System.out.printf("%45s%.2f%n", "VAT: ",  vatPrice);
	System.out.println();

	System.out.println("===============================================================================");
	System.out.printf("%45s%.2f%n", "Bills total: ", billsTotal);
	System.out.printf("%45s%.2f%n", "The amount paid: ", amountPaid);
	System.out.printf("%45s%.2f%n", "Balance: ", balance);
	System.out.println("===============================================================================");

	System.out.println("===============================================================================");
	System.out.printf("%45s%n", "THANKS FOR YOUR PATRONAGE!!!");
	System.out.println("===============================================================================");

   }
}