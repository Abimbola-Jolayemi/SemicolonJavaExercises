def combine_list(lst1,lst2):
	joined_list = []
	for i in range(len(lst1)):
		joined_list.append(lst1[i])
	for i in range(len(lst2)):
		joined_list.append(lst2[i])
	return joined_list

list1 = ['a', 'b', 'c']
list2 = [1, 2, 3]
result = combine_list(list1, list2)
print(result)