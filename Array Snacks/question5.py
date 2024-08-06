def numbers_on_even_positions(list):
	even_index_numbers = []
	for index in range(0, len(list)):
		if index % 2 == 0:
			even_index_numbers.append(list[index])
	return even_index_numbers

print(numbers_on_even_positions([1, 2, 3, 4, 5, 6, 7, 8, 9]))