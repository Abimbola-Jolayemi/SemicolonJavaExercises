public class CreditCardValidatorFunction{

	private String cardNumber;

	public void setCardNumber(String cardNumber){
		this.cardNumber = cardNumber;
	}

	public String getCardNumber(){
		return cardNumber;
	}

   	public String checkCardLength(String cardNumber) {
    		this.cardNumber = cardNumber;
    		int cardLength = cardNumber.length();
    		if (cardLength >= 13 && cardLength <= 16) {
        		return Integer.toString(cardLength);
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
	
	public String checkCardValidity(String cardNumber){
		int first = addUpDigitsFromRightToLeft(cardNumber);
		int second = addUpDigitsInOddPlaces(cardNumber);
		if((first + second) % 10 == 0){
			return "The card is valid";
		}
		else{
			return "The card is invalid";
		}
	}

	public String checkCardType(String cardNumber){
		this.cardNumber = cardNumber;

		if(cardNumber.charAt(0) == '4'){
			return "Visacard";
		} else if (cardNumber.charAt(0) == '5'){
			return "MasterCard";
		} else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			return "American Express Card";
		} else if(cardNumber.charAt(0) == '6'){
			return "Discover cards";
		} else {
			throw new IllegalArgumentException("Invalid number!!!");
		}
	}
		
		public String[] displayCardDetails(String cardNumber) {
        	return new String[]{
            		checkCardType(cardNumber),
            		cardNumber,
            		checkCardLength(cardNumber),
            		checkCardValidity(cardNumber)
        		};
    		}

}