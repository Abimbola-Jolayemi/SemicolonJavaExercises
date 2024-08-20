def re_arrange(numbers):
    new_list = [0] * len(numbers)
    
    for index in range(0, len(numbers), 2):
        if index + 1 < len(numbers):
            new_list[index] = numbers[index + 1]
            new_list[index + 1] = numbers[index]
    
    return new_list

print(re_arrange([1, 2, 3, 4, 5, 6]))