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
	public void testThatChecksForCardValidity(){
		CreditCardValidator validator = new CreditCardValidator();
		boolean result = validator.checkCardValidity("4388576018410707");
		assertEquals(true, result);
	}
}