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

	public int addUpDigitsFromRightToLeft(String cardNumber){
		this.cardNumber = cardNumber;

		int cardLength = cardNumber.length();
		int total = 0;

		for(int count = cardLength - 2; count >= 0; count-=2){
			char numberCharacter = cardNumber.charAt(count);
			String numberString = String.valueOf(numberCharacter);
			int number = Integer.parseInt(numberString);
			int num = number * 2;
			if(num >= 10){
				int digit1 = num % 10;
				num = num / 10;
				int digit2  = num % 10;
				num = digit1 + digit2;
			}
			total = total + num;
		}
		return total;
	}

	public int addUpDigitsInOddPlaces(String cardNumber){
		this.cardNumber = cardNumber;

		int cardLength = cardNumber.length();
		int total = 0;
		int number = 0;
		for(int count = cardLength - 1; count >= 0; count--){
			if(count % 2 != 0){
				char numberCharacter = cardNumber.charAt(count);
				String numberString = String.valueOf(numberCharacter);
				number = Integer.parseInt(numberString);
				total = total + number;
			}
		}
		return total;
	}
}