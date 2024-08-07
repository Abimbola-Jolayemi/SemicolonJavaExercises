public class MenstrualPalava{

	private int month;
	private int date;
	private int year;
	private int cycleDuration;

	public MenstrualPalava(int month, int date, int year, int cycleDuration){
		this.month = month;
        	this.date = date;
        	this.year = year;
        	this.cycleDuration = cycleDuration;
	}
	
	private int getDaysInMonth(int month, int year){
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			return 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else if (month == 2){
			return (checkLeapYear(year)) ? 29 : 28;
		}
		else{
			throw new IllegalArgumentException("Invalid month: " + month);
		}
	}

	public boolean checkLeapYear(int year){
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
		
		while(dateCount > getDaysInMonth(nextMonth, year)){
			dateCount = dateCount - (getDaysInMonth(nextMonth, nextYear));
			nextMonth = nextMonth + 1;

			if(nextMonth > 12){
				nextMonth = 1;
				nextYear = nextYear + 1;
			}
		} 
		
		return String.format("%02d-%02d-%04d", dateCount, nextMonth, nextYear);
  	 }
}