def numbers_on_odd_positions(list):
	odd_index_numbers = []
	for index in range(0, len(list)):
		if index % 2 == 1:
			odd_index_numbers.append(list[index])
	return odd_index_numbers

print(numbers_on_odd_positions([1, 2, 3, 4, 5, 6, 7, 8, 9]))