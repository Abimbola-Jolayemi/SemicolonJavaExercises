public class AddToCart{
   private ArrayList<CheckOutFunction> cart = new ArrayList<>();

	public void addProductToCart(String productName, double price, int quantity, double total){
		CheckOutFunction checkout = new CheckOutFunction(productName, price, quantity, total);

		cart.add(product);
	}
}