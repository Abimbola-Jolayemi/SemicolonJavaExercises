import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckOutTest{
   
	@Test
	public void testThatChecksForUsersProductName(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		String result = checkout.getProductName();
		assertEquals("Biscuits", result);
	}

	@Test
	public void testThatChecksForProductPrice(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		double result = checkout.getProductPrice();
		assertEquals(2300, result);
	}

	@Test
	public void testThatChecksForQuantity(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		int result = checkout.getProductQuantity();
		assertEquals(3, result);
	}

	@Test
	public void testThatChecksTheTotalPricePerProduct(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		double result = checkout.computeTotalPricePerProduct();
		assertEquals(6900, result);
	}

	@Test
	public void testThatChecksForDiscountedPrice(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		double result = checkout.computeDiscountOnPrice(8, 6900);
		assertEquals(552, result);
	}

	@Test
	public void testThatChecksForVATOnPrice(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		double result = checkout.computeVATOnPrice(17.5, 6900);
		assertEquals(1207.5, result);
	}

	@Test
	public void testThatChecksForBillsTotal(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		double result = checkout.computeBillsTotal(8, 17.5, 6900);
		assertEquals(7555.5, result);
	}

	@Test
	public void testThatChecksBalance(){
		CheckOutFunction checkout = new CheckOutFunction("Biscuits", 3, 2300, 6900);
		assertThrows(IllegalArgumentException.class, () -> checkout.computeBalance(5000, 7555.5));
	}

}




