import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
}