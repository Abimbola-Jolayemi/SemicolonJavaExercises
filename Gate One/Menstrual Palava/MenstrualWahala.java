import java.util.ArrayList;
import java.util.List;

public class MenstrualWahala {

    private int month;
    private int date;
    private int year;
    private int cycleDuration;
    private int bleedingDuration;
    private int nextStartDate;
    private int endNextCycleDate;
    private int bleedingEndDate;
    private int ovulationDate;

    public MenstrualWahala(int month, int date, int year, int cycleDuration, int bleedingDuration) {
        this.month = month;
        this.date = date;
        this.year = year;
        this.cycleDuration = cycleDuration;
        this.bleedingDuration = bleedingDuration;
    }

    public int getDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return (checkLeapYear(year)) ? 29 : 28;
        } else {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    public boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String getNextCycleDate() {
        int day = date + cycleDuration;
        int currentMonth = month;
        int currentYear = year;

        while (day > getDaysInMonth(currentMonth, currentYear)) {
            day -= getDaysInMonth(currentMonth, currentYear);
            currentMonth++;

            if (currentMonth > 12) {
                currentMonth = 1;
                currentYear++;
            }
        }

        nextStartDate = day;
        month = currentMonth;
        year = currentYear;

        return String.format("%02d-%02d-%04d", nextStartDate, month, year);
    }

    public String getEndOfNextCycle() {
        int endDate = nextStartDate + cycleDuration - 1;
        int currentMonth = month;
        int currentYear = year;

        while (endDate > getDaysInMonth(currentMonth, currentYear)) {
            endDate -= getDaysInMonth(currentMonth, currentYear);
            currentMonth++;

            if (currentMonth > 12) {
                currentMonth = 1;
                currentYear++;
            }
        }

        endNextCycleDate = endDate;
        month = currentMonth;
        year = currentYear;

        return String.format("%02d-%02d-%04d", endNextCycleDate, month, year);
    }

    public String getEndBleedingDate() {
        int endBleedingDate = date + bleedingDuration - 1;
        int currentMonth = month;
        int currentYear = year;

        while (endBleedingDate > getDaysInMonth(currentMonth, currentYear)) {
            endBleedingDate -= getDaysInMonth(currentMonth, currentYear);
            currentMonth++;

            if (currentMonth > 12) {
                currentMonth = 1;
                currentYear++;
            }
        }

        bleedingEndDate = endBleedingDate;

        return String.format("%02d-%02d-%04d", bleedingEndDate, currentMonth, currentYear);
    }

    public String getOvulationPeriod() {
        int ovulationDay = nextStartDate + cycleDuration - 14;
        int currentMonth = month;
        int currentYear = year;

        while (ovulationDay > getDaysInMonth(currentMonth, currentYear)) {
            ovulationDay -= getDaysInMonth(currentMonth, currentYear);
            currentMonth++;

            if (currentMonth > 12) {
                currentMonth = 1;
                currentYear++;
            }
        }

        while (ovulationDay < 1) {
            currentMonth--;
            if (currentMonth < 1) {
                currentMonth = 12;
                currentYear--;
            }
            ovulationDay += getDaysInMonth(currentMonth, currentYear);
        }

        return String.format("%02d-%02d-%04d", ovulationDay, currentMonth, currentYear);
    }

    public List<String> getFertileDays() {
        List<String> fertileDays = new ArrayList<>();
        int currentMonth = month;
        int currentYear = year;
        int ovulationDay = nextStartDate + cycleDuration - 14;
        int startFertilePeriod = ovulationDay - 3;
        int endFertilePeriod = ovulationDay + 2;

        for (int index = startFertilePeriod; index <= endFertilePeriod; index++) {
            int day = index;
            int monthDays = getDaysInMonth(currentMonth, currentYear);

            while (day > monthDays) {
                day -= monthDays;
                currentMonth++;

                if (currentMonth > 12) {
                    currentMonth = 1;
                    currentYear++;
                }
                monthDays = getDaysInMonth(currentMonth, currentYear);
            }

            while (day <= 0) {
                currentMonth--;
                if (currentMonth < 1) {
                    currentMonth = 12;
                    currentYear--;
                }
                monthDays = getDaysInMonth(currentMonth, currentYear);
                day += monthDays;
            }

            fertileDays.add(String.format("%02d-%02d-%04d", day, currentMonth, currentYear));
        }
        return fertileDays;
    }

    public List<String> getSafeDays() {
        List<String> safeDays = new ArrayList<>();
        int currentMonth = month;
        int currentYear = year;
        int ovulationDay = nextStartDate + cycleDuration - 14;
        int startSafePeriod1 = 1;
        int endSafePeriod1 = ovulationDay - 7;
        int startSafePeriod2 = ovulationDay + 2;
        int endSafePeriod2 = nextStartDate - 1;

        for (int index1 = startSafePeriod1; index1 <= endSafePeriod1; index1++) {
            int day = index1;
            int monthDays = getDaysInMonth(currentMonth, currentYear);

            while (day > monthDays) {
                day -= monthDays;
                currentMonth++;

                if (currentMonth > 12) {
                    currentMonth = 1;
                    currentYear++;
                }
                monthDays = getDaysInMonth(currentMonth, currentYear);
            }

            safeDays.add(String.format("%02d-%02d-%04d", day, currentMonth, currentYear));
        }

        for (int index2 = startSafePeriod2; index2 <= endSafePeriod2; index2++) {
            int day = index2;
            int monthDays = getDaysInMonth(currentMonth, currentYear);

            while (day > monthDays) {
                day -= monthDays;
                currentMonth++;

                if (currentMonth > 12) {
                    currentMonth = 1;
                    currentYear++;
                }
                monthDays = getDaysInMonth(currentMonth, currentYear);
            }

            safeDays.add(String.format("%02d-%02d-%04d", day, currentMonth, currentYear));
        }

        return safeDays;
    }
}