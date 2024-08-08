public class CreditCardValidator{

	private String cardNumber;

   	public int checkCardLength(String cardNumber){
		this.cardNumber = cardNumber;
		int cardLength = cardNumber.length();
		if (cardLength >= 13 && cardLength <= 16){
			return cardLength;
		} else {
			throw new IllegalArgumentException("Invalid card number");
		}
	}
}