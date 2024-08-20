def validate_input():
	while True:
		try:
			delivery_number = int(input("Enter number of successful delivery: "))
			if(delivery_number < 0):
				print("Enter a valid input!!!")
			else:
				return delivery_number
		except ValueError:
			print("Invalid input, enter a valid number!!!")

def delivery_input():
	delivery_number = validate_input()
	result = 0
	if delivery_number < 50:
		result = delivery_number * 160 + 5000
	elif delivery_number <= 59 and delivery_number >= 50:
		result = delivery_number * 200 + 5000
	elif delivery_number <= 69 and delivery_number >= 60:
		result = delivery_number * 250 + 5000
	elif delivery_number >= 70:
		result = delivery_number * 500 + 5000
	return result


result = delivery_input()
print("The wage of the rider is", result)

