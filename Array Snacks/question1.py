def find_largest_integer(list_of_numbers):
	largest_number = list_of_numbers[0]
	for index in list_of_numbers:
		if index > largest_number:
			largest_number = index
	return largest_number