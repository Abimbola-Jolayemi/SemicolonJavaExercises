public class CheckOutFunction{

	private String productName;
	private double productPrice;
	private int quantity;
	private double productTotal;
	private double discountedPrice;
	private double vatPrice;
	private double billsTotal;
	private double balance;
	
	public CheckOutFunction(String productName, int quantity, double price, double productTotal){
		this.productName = productName;
		this.productPrice = price;
		this.quantity = quantity;
		this.productTotal = productTotal;
	}

	public String getProductName(){
		return productName;
	}

	public double getProductPrice(){
		return productPrice;
	}

	public int getProductQuantity(){
		return quantity;
	}

	public double computeTotalPricePerProduct(){
		this.productTotal = productPrice * quantity;
		return productTotal;
	}

	public double computeDiscountOnPrice(double discount, double totalPrice){
		this.discountedPrice = (discount / 100) * totalPrice;
		return discountedPrice;
	}

	public double computeVATOnPrice(double vat, double totalPrice){
		this.vatPrice = (vat / 100) * totalPrice;
		return vatPrice;
	}

	public double computeBillsTotal(double discount, double vat, double totalPrice){
		double vatAmount = (vat / 100) * totalPrice;
		double discountAmount = (discount / 100) * totalPrice;
		double billAmount = (vatAmount - discountAmount) + totalPrice;
		this.billsTotal = billAmount;
		return billsTotal;
	}

	public double computeBalance(double amount, double billsTotal){
		this.billsTotal = billsTotal;
		if(amount > billsTotal){
			this.balance = amount - billsTotal;
			return balance;
		} else {
			throw new IllegalArgumentException("Amount paid is less than total bills");
		}
	}

}