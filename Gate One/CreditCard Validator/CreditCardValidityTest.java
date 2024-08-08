import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreditCardValidityTest{
   
 	@Test
	public void testThatChecksForCardLength(){
		CreditCardValidator validator = new CreditCardValidator();
		assertThrows(IllegalArgumentException.class, () -> validator.checkCardLength("12345678"));	
	}

	@Test
	public void testThatAddsUpDigitsFromRightToLeft(){
		CreditCardValidator validator = new CreditCardValidator();
		int result = validator.addUpDigitsFromRightToLeft("4388576018402626");
		assertEquals(37, result);
	}

	@Test
	public void testThatAddsUpDigitsInOddIndex(){
		CreditCardValidator validator = new CreditCardValidator();
		int result = validator.addUpDigitsInOddPlaces("4388576018402626");
		assertEquals(38, result);
	}

	@Test
	public void testThatChecksCardValidity(){
		CreditCardValidator validator = new CreditCardValidator();
		String result = validator.checkCardValidity("4388576018402626");
		assertEquals("The card is invalid", result);
	}

	
	@Test
	public void testThatCheckForCardType(){
		CreditCardValidator validator = new CreditCardValidator();
		assertThrows(IllegalArgumentException.class, () -> validator.checkCardType("12345678"));
	}

	@Test
    	public void testThatChecksAllCardDetails() {
        	CreditCardValidator validator = new CreditCardValidator();
        	String[] result = validator.displayCardDetails("5399831619690403");
        	assertArrayEquals(new String[] {"MasterCard", "5399831619690403", "16", "The card is invalid"}, result);
    	}

}
