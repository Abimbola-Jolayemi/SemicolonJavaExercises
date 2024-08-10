import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;

public class MenstrualCycleTest{
   
	@Test
	public void testThatChecksForNextCycleDate(){
		MenstrualCycleFunction menscycle = new MenstrualCycleFunction(1, 3, 2024, 28, 5);
		LocalDate expectedDate = LocalDate.of(2024, 3, 29);
		LocalDate nextCycleDate = menscycle.getNextCycleDate();
		assertEquals(expectedDate, nextCycleDate);
	}

	@Test
	public void testThatChecksForEndOfPeriodDate(){
		MenstrualCycleFunction menscycle = new MenstrualCycleFunction(1, 3, 2024, 28, 5);
		LocalDate expectedPeriodDate = LocalDate.of(2024, 3, 5);
		LocalDate givenPeriodDate = menscycle.mensEnding();
		assertEquals(expectedPeriodDate, givenPeriodDate);
	}

	@Test
	public void testThatCheckForOvulationDate(){
		MenstrualCycleFunction menscycle = new MenstrualCycleFunction(1, 3, 2024, 28, 5);
		LocalDate expectedOvulationDate = LocalDate.of(2024, 3, 15);
		LocalDate givenOvulationDate = menscycle.getOvulationDate();
		assertEquals(expectedOvulationDate, givenOvulationDate);
	}

	@Test
	public void testForFertileStartDate(){
		MenstrualCycleFunction menscycle = new MenstrualCycleFunction(1, 3, 2024, 28, 5);
		LocalDate expectedFertileStartDate = LocalDate.of(2024, 3, 10);
		LocalDate givenFertileStartDate = menscycle.getFertileStartDate();
		assertEquals(expectedFertileStartDate, givenFertileStartDate);
	}

	@Test
	public void testForFertileEndDate(){
		MenstrualCycleFunction menscycle = new MenstrualCycleFunction(1, 3, 2024, 28, 5);
		LocalDate expectedFertileEndDate = LocalDate.of(2024, 3, 17);
		LocalDate givenFertileEndDate = menscycle.getFertileEndDate();
		assertEquals(expectedFertileEndDate, givenFertileEndDate);
	}
}
