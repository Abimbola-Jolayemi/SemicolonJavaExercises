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
	return get_ovulation_date(start_date, cycle_duration) + timedelta(days=1)  # Ends 1 day after ovulation

def get_fertile_days(start_date, cycle_duration):
	fertile_days = []
	fertile_start = get_fertile_start_date(start_date, cycle_duration)
	fertile_end = get_fertile_end_date(start_date, cycle_duration)
	current_date = fertile_start
	while current_date <= fertile_end:
		fertile_days.append(current_date)
		current_date += timedelta(days=1)
	return fertile_days

def get_safe_days(start_date, cycle_duration):
	safe_days = []
	end_of_menstrual = mens_ending(start_date, menstrual_duration)
	fertile_start = get_fertile_start_date(start_date, cycle_duration)
	safe_date = end_of_menstrual + timedelta(days=1)
	while safe_date < fertile_start:
		safe_days.append(safe_date)
		safe_date += timedelta(days=1)
	fertile_end = get_fertile_end_date(start_date, cycle_duration)
	next_cycle_start = get_next_cycle_date(start_date, cycle_duration)
	safe_date = fertile_end + timedelta(days=1)
	while safe_date < next_cycle_start:
		safe_days.append(safe_date)
		safe_date += timedelta(days=1)
	return safe_days

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
safe_days = get_safe_days(cycle_start_date, cycle_duration)

print("\n******************************************************************")
print(f"\nHello, {name}")
print(f"Menstrual Ending Date: {end_date.strftime('%Y-%m-%d')}")
print(f"Next Cycle Date: {next_cycle_date.strftime('%Y-%m-%d')}")
print(f"Ovulation Date: {ovulation_date.strftime('%Y-%m-%d')}")
print(f"Fertility Days:")
for day in fertile_days:
	print(day.strftime('%Y-%m-%d'))
print(f"\nSafe dates:")
for day in safe_days:
    print(day.strftime('%Y-%m-%d'))






