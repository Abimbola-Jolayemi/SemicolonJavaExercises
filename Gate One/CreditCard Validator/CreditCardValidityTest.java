import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreditCardValidityTest{
   
 	@Test
	public void testThatChecksForCardLength(){
		CreditCardValidatorFunction validator = new CreditCardValidatorFunction();
		assertThrows(IllegalArgumentException.class, () -> validator.checkCardLength("12345678"));	
	}

	@Test
	public void testThatAddsUpDigitsFromRightToLeft(){
		CreditCardValidatorFunction validator = new CreditCardValidatorFunction();
		int result = validator.addUpDigitsFromRightToLeft("4388576018402626");
		assertEquals(37, result);
	}

	@Test
	public void testThatAddsUpDigitsInOddIndex(){
		CreditCardValidatorFunction validator = new CreditCardValidatorFunction();
		int result = validator.addUpDigitsInOddPlaces("4388576018402626");
		assertEquals(38, result);
	}

	@Test
	public void testThatChecksCardValidity(){
		CreditCardValidatorFunction validator = new CreditCardValidatorFunction();
		String result = validator.checkCardValidity("4388576018402626");
		assertEquals("The card is invalid", result);
	}

	
	@Test
	public void testThatCheckForCardType(){
		CreditCardValidatorFunction validator = new CreditCardValidatorFunction();
		assertThrows(IllegalArgumentException.class, () -> validator.checkCardType("12345678"));
	}

	@Test
    	public void testThatChecksAllCardDetails() {
        	CreditCardValidatorFunction validator = new CreditCardValidatorFunction();
        	String[] result = validator.displayCardDetails("5399831619690403");
        	assertArrayEquals(new String[] {"MasterCard", "5399831619690403", "16", "The card is invalid"}, result);
    	}

}
