public class Back2SenderFunction{

	public int deliveryInput(int number){
		int result;

		if (number < 50)
			result = number * 160 + 5000;
		else if (number <= 59 && number >= 50)
			result = number * 200 + 5000;
		else if (number <= 69 && number >= 60)
			result = number * 250 + 5000;
		else if (number >= 70)
			result = number * 500 + 5000;
		else
			result = 0;

		return result;
	}
}