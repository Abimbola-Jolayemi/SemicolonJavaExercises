def reverse_list(list):
	reversed_list = []
	for index in range(len(list)):
		reversed_list.append(list[len(list) - 1 - index])
	return reversed_list
