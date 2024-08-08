public class MenstrualPalava{

	private int month;
	private int date;
	private int nextStartDate;
	private int year;
	private int cycleDuration;
	private int bleedingDuration;
	private int bleedingEndDate;

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

		public String getOvulationPeriod(){
			int nextMonth = month;
			int nextYear = year;
			int ovulationPeriod = cycleDuration - 14;
			int endOvulationDate = bleedingEndDate + ovulationPeriod;

			while(endOvulationDate > getDaysInMonth()){
				endOvulationDate = endOvulationDate - (getDaysInMonth());
				nextMonth = nextMonth + 1;

				if(nextMonth > 12){
					nextMonth = 1;
					nextYear = nextYear + 1;
				}
			}
			return String.format("%02d-%02d-%04d", endOvulationDate, nextMonth, nextYear);
		}
}