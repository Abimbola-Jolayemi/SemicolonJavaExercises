import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.AssertEquals;
import static org.junit.jupiter.api.Assertions.AssertThrows;

public class PhoneBookTest{

	@Test
	public void testThatAddContact(){
		PhoneBookFunction phonebook = new PhoneBookFunction();
		String[] contactDetails = phonebook.addContact("Abimbola", "Jolayemi", "032233");
		assertEquals([{"Abimbola", "Jolayemi", "032233"}, contactDetails]
	}
}