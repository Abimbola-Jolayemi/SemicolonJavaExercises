from datetime import datetime, timedelta

def mens_ending(start_date, menstrual_duration):
	return start_date + timedelta(days=menstrual_duration - 1)
def get_next_cycle_date(start_date, cycle_duration):
	return start_date + timedelta(days=cycle_duration)
def get_ovulation_date(start_date, cycle_duration):
	return get_next_cycle_date(start_date, cycle_duration) - timedelta(days=14)
def get_fertile_start_date(start_date, cycle_duration):
	return get_ovulation_date(start_date, cycle_duration) - timedelta(days=5)
def get_fertile_end_date(start_date, cycle_duration):
	return get_ovulation_date(start_date, cycle_duration) + timedelta(days=2)
def get_fertile_days(start_date, cycle_duration):
	fertile_days = []
	start_date = get_fertile_start_date(start_date, cycle_duration)
	end_date = get_fertile_end_date(start_date, cycle_duration)
	while start_date <= end_date:
		fertile_days.append(start_date)
		start_date += timedelta(days=1)
	return fertile_days
def get_first_safe_days(start_date, cycle_duration):
	first_safe_days = []
	start_date = mens_ending(start_date, cycle_duration) + timedelta(days=1)
	end_date = get_fertile_start_date(start_date, cycle_duration) - timedelta(days=1)
	while start_date <= end_date:
		first_safe_days.append(start_date)
		start_date += timedelta(days=1)
	return first_safe_days
def get_second_safe_days(start_date, cycle_duration):
	second_safe_days = []
	start_date = get_fertile_end_date(start_date, cycle_duration) + timedelta(days=1)
	end_date = get_next_cycle_date(start_date, cycle_duration)
	while start_date <= end_date:
		second_safe_days.append(start_date)
		start_date += timedelta(days=1)
	return second_safe_days

name = input("Enter your name: ");
age = int(input("Enter age: "))
while True:
    try:
        day = int(input("Enter the day you started your cycle: "))
        month = int(input("Enter the month: "))
        year = int(input("Enter the year: "))

        cycle_start_date = datetime(year, month, day)
        break
    except ValueError:
        print("Invalid date. Please enter a valid day, month, and year.")

cycle_duration = int(input("Enter the cycle duration in days: "))
menstrual_duration = int(input("Enter the menstrual duration in days: "))

end_date = mens_ending(cycle_start_date, menstrual_duration)
next_cycle_date = get_next_cycle_date(cycle_start_date, cycle_duration)
ovulation_date = get_ovulation_date(cycle_start_date, cycle_duration)
fertile_days = get_fertile_days(cycle_start_date, cycle_duration)
first_safe_days = get_first_safe_days(cycle_start_date, cycle_duration)
second_safe_days = get_second_safe_days(cycle_start_date, cycle_duration)



print(f"Menstrual Ending Date: {end_date.strftime('%Y-%m-%d')}")
print(f"Next Cycle Date: {next_cycle_date.strftime('%Y-%m-%d')}")
print(f"Ovulation Date: {ovulation_date.strftime('%Y-%m-%d')}")
print(f"Fertile Days:")
for day in fertile_days:
	print(day.strftime('%Y-%m-%d'))
print(f"First Safe Days:")
for day in first_safe_days:
	print(day.strftime('%Y-%m-%d'))
for day in second_safe_days:
	print(day.strftime('%Y-%m-%d'))







