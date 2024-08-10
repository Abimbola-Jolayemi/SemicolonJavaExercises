import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class MenstrualCycleFunction{

	private LocalDate cycleStartDate;
	private int cycleDuration;
	private final int OVULATION_OFFSET = 14;
	private final int FERTILE_START_DATE = 5;
	private final int FERTILE_END_DATE = 2;
	private int menstrualDuration;

	public MenstrualCycleFunction(int date, int month, int year, int cycleDuration, int menstrualDuration){
		try {
            		this.cycleStartDate = LocalDate.of(year, month, date);
        	} catch (DateTimeParseException e) {
            		System.out.println("Invalid date provided: " + e.getMessage());
            		this.cycleStartDate = LocalDate.now();
        	}
		this.cycleDuration = cycleDuration;
		this.menstrualDuration = menstrualDuration;
	}

	public LocalDate mensEnding(){
		return cycleStartDate.plusDays(menstrualDuration-1);
	}

	public LocalDate getNextCycleDate(){
		return cycleStartDate.plusDays(cycleDuration);
	}

	public LocalDate getOvulationDate(){
		return getNextCycleDate().minusDays(OVULATION_OFFSET);
	}

	public LocalDate getFertileStartDate(){
		return getOvulationDate().minusDays(FERTILE_START_DATE);
	}

	public LocalDate getFertileEndDate(){
		return getOvulationDate().plusDays(FERTILE_END_DATE);
	}

	public ArrayList<LocalDate> getFertileDays(){
        	ArrayList<LocalDate> fertileDays = new ArrayList<>();
        	LocalDate startDate = getFertileStartDate();
        	LocalDate endDate = getFertileEndDate();

        	while (!startDate.isAfter(endDate)) {
        		fertileDays.add(startDate);
        		startDate = startDate.plusDays(1);
    		}

       		return fertileDays;
    	}

	public ArrayList<LocalDate> getFirstSafeDays(){
		ArrayList<LocalDate> firstSafeDays = new ArrayList<>();
        	LocalDate startDate = mensEnding().plusDays(1);
        	LocalDate endDate = getFertileStartDate().minusDays(1);

        	while (!startDate.isAfter(endDate)) {
        		firstSafeDays.add(startDate);
        		startDate = startDate.plusDays(1);
    		}

       		return firstSafeDays;
	}

	public ArrayList<LocalDate> getSecondSafeDays(){
		ArrayList<LocalDate> secondSafeDays = new ArrayList<>();
        	LocalDate startDate = getFertileEndDate().plusDays(1);
        	LocalDate endDate = getNextCycleDate();

        	while (!startDate.isAfter(endDate)) {
        		secondSafeDays.add(startDate);
        		startDate = startDate.plusDays(1);
    		}
       		return secondSafeDays;
	}
	
}
