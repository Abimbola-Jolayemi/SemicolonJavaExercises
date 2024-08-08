import java.util.ArrayList;
import java.util.List;

public class MenstrualPalava{

	private int month;
	private int date;
	private int nextStartDate;
	private int endOfNextCycleDate;
	private int endOfBleedingMonth;
	private int endOfBleedingYear;
	private int year;
	private int cycleDuration;
	private int bleedingDuration;
	private int bleedingEndDate;
	private int ovulationDate;
	private int ovulationSpan = 14;

	public MenstrualPalava(int month, int date, int year, int cycleDuration, int bleedingDuration){
		this.month = month;
        	this.date = date;
        	this.year = year;
        	this.cycleDuration = cycleDuration;
		this.bleedingDuration = bleedingDuration;
	}
	
	public int getDaysInMonth(){
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			return 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else if (month == 2){
			return (checkLeapYear()) ? 29 : 28;
		}
		else{
			throw new IllegalArgumentException("Invalid month: " + month);
		}
	}

	public boolean checkLeapYear(){
		if (year % 4 == 0){
			if (year % 100 != 0){
				return true;
			} else {
				return false;
			}
		} else if (year % 400 == 0){
			return true;
		}
		else{
			return false;
		}
	}

   	public String getNextCycleDate(){
		int dateCount = date + cycleDuration;
		int nextMonth = month;
		int nextYear = year;
		
		while(dateCount > getDaysInMonth()){
			dateCount = dateCount - (getDaysInMonth());
			nextMonth = nextMonth + 1;

			if(nextMonth > 12){
				nextMonth = 1;
				nextYear = nextYear + 1;
			}
		} 
			nextStartDate = dateCount;
			month = nextMonth;
			year = nextYear; 
		
		return String.format("%02d-%02d-%04d", nextStartDate, month, year);
  	 }

	public String getEndOfNextCycle(){
		endOfNextCycleDate = (nextStartDate + cycleDuration) - 1;

		while(endNextCycleDate > getDaysInMonth()){
			endOfNextCycleDate = endOfNextCycleDate - (getDaysInMonth());
			month = month + 1;

			if(month > 12){
				month = 1;
				year = year + 1;
			}
		}
			endOfBleedingMonth = month;
			endOfBleedingYear = year;

		return String.format("%02d-%02d-%04d", endOfNextCycleDate, month, year);
	}

		public String getEndBleedingDate(){
			int endBleedingCount = (nextStartDate + bleedingDuration) - 1;
			int nextMonth = month;
			int nextYear = year;
		
		while(endBleedingCount > getDaysInMonth()){
			endBleedingCount = endBleedingCount - (getDaysInMonth());
			nextMonth = nextMonth + 1;

			if(nextMonth > 12){
				nextMonth = 1;
				nextYear = nextYear + 1;
			}
		}
			bleedingEndDate = endBleedingCount;
		
			return String.format("%02d-%02d-%04d", bleedingEndDate, nextMonth, nextYear);
		}

		public String getOvulationPeriod() {
    			int nextMonth = month;
    			int nextYear = year;
    			int ovulationDay = nextStartDate + cycleDuration - 14;

    			while (ovulationDay > getDaysInMonth()) {
        			ovulationDay -= getDaysInMonth();
        			nextMonth++;
        			if (nextMonth > 12) {
            				nextMonth = 1;
            				nextYear++;
        			}
    			}

   			while (ovulationDay < 1) {
        			nextMonth--;
        			if (nextMonth < 1) {
            				nextMonth = 12;
            				nextYear--;
        			}
        			ovulationDay += getDaysInMonth();
    			}
				this.ovulationDate = ovulationDate;
    				return String.format("%02d-%02d-%04d", ovulationDay, nextMonth, nextYear);
			}

	public List<String> getFertileDays() {
        		List<String> fertileDays = new ArrayList<>();
        		int nextMonth = month;
        		int nextYear = year;
        		int startFertilePeriod = ovulationDate - 7;
        		int endFertilePeriod = ovulationDate + 1;

        		for (int index = startFertilePeriod; index <= endFertilePeriod; index++) {
            			int day = index;
]

            			int monthDays = getDaysInMonth();

            			while (day > monthDays) {
                			day -= monthDays;
                			nextMonth++;
                			if (nextMonth > 12) {
                    				nextMonth = 1;
                    				nextYear++;
                			}
                			monthDays = getDaysInMonth();
            			}

            			while (day <= 0) {
                			nextMonth--;
                			if (nextMonth < 1) {
                    				nextMonth = 12;
                    				nextYear--;
                			}
                			monthDays = getDaysInMonth();
                			day += monthDays;
            			}

            			fertileDays.add(String.format("%02d-%02d-%04d", day, nextMonth, nextYear));
        		}
        		return fertileDays;
    		}

}