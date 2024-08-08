import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualTest{

	@Test
   	public void testforDate(){
		MenstrualPalava input = new MenstrualPalava(2, 6, 2024, 32, 7);
		int result = input.getDaysInMonth(2, 2024);
		assertEquals(29, result);
	}
}