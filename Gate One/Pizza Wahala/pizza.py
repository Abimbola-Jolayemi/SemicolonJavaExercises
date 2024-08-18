def get_pizza_slices_per_box(pizza_type):
    pizza_type = pizza_type.lower()
    if pizza_type == "odogwu":
        return 12
    elif pizza_type == "big boys":
        return 8
    elif pizza_type == "small money":
        return 6
    elif pizza_type == "sapa size":
        return 4
    else:
        return 0

def get_price_per_box(pizza_type):
    pizza_type = pizza_type.lower()
    if pizza_type == "odogwu":
        return 4200
    elif pizza_type == "big boys":
        return 3000
    elif pizza_type == "small money":
        return 2400
    elif pizza_type == "sapa size":
        return 2000
    else:
        return 0

def get_no_of_boxes(no_of_guests, pizza_type):
    slices_per_box = get_pizza_slices_per_box(pizza_type)
    no_of_boxes = no_of_guests // slices_per_box
    if no_of_boxes * slices_per_box < no_of_guests:
        no_of_boxes += 1
    return no_of_boxes

def get_left_over(no_of_guests, pizza_type):
    slices_per_box = get_pizza_slices_per_box(pizza_type)
    total_no_of_slices = get_no_of_boxes(no_of_guests, pizza_type) * slices_per_box
    return total_no_of_slices - no_of_guests

def get_total_cost(no_of_guests, pizza_type):
    price_per_box = get_price_per_box(pizza_type)
    return get_no_of_boxes(no_of_guests, pizza_type) * price_per_box

def display_pizza_type():
    print("""
1. Sapa size
2. Small money
3. Big Boys
4. Odogwu
""")

def display_table():
    print("---------------------------------------------------")
    print("| PIZZA TYPE   | NUMBER OF SLICES | PRICE PER BOX |")
    print("---------------------------------------------------")
    print("| Sapa Size    | 4                | 2000          |")
    print("---------------------------------------------------")
    print("| Small Money  | 6                | 2400          |")
    print("---------------------------------------------------")
    print("| Big Boys     | 8                | 3000          |")
    print("---------------------------------------------------")
    print("| Odogwu       | 12               | 4200          |")
    print("---------------------------------------------------")


def get_validated_guests():
    while True:
        try:
            guests = int(input("Enter the number of guests: "))
            if guests > 0:
                return guests
            else:
                print("Please try again. Enter a positive number for Number of Guests: ")
        except ValueError:
            print("Invalid input. Please enter a positive integer for the number of guests.")

def get_validated_pizza_type():
    while True:
        pizza_type = input("Enter pizza type: ").lower()
        if pizza_type in ["sapa size", "small money", "big boys", "odogwu"]:
            return pizza_type
        else:
            print("Invalid pizza type. Please enter one of the following: Sapa size, Small Money, Big boys, Odogwu.")



display_table()

guests = get_validated_guests()
pizza_type = get_validated_pizza_type()

print()
print("Number of boxes:", get_no_of_boxes(guests, pizza_type))
print("Leftover slices:", get_left_over(guests, pizza_type))
print("Total cost: #", get_total_cost(guests, pizza_type))