list_of_contacts = []

def add_contact(first_name, last_name, phone_numbers):
	contact_info = {
		'first_name': first_name.upper(),
		'last_name': last_name.upper(),
		'phone_numbers': phone_numbers}
		list_of_contacts.append(contact_info)

def display_contacts():
    if not list_of_contacts:
        print("No contacts to display.")
        return
    for contact in list_of_contacts:
        print(f"First Name: {contact['first_name']}")
        print(f"Last Name: {contact['last_name']}")
        print("Phone Numbers: ", ", ".join(contact['phone_numbers']))
        print()

def find_contact_by_first_name(first_name):
    for contact in list_of_contacts:
        if contact['first_name'].lower() == first_name.lower():
            return contact
    return None

def find_contact_by_last_name(last_name):
    for contact in list_of_contacts:
        if contact['last_name'].lower() == last_name.lower():
            return contact
    return None

def find_contact_by_phone_number(phone_number):
    for contact in list_of_contacts:
        if phone_number in contact['phone_numbers']:
            return contact
    return None

def remove_contact(first_name, last_name):
    first_name = first_name.strip().upper()
    last_name = last_name.strip().upper()
    for contact in list_of_contacts:
        if contact['first_name'] == first_name and contact['last_name'] == last_name:
            list_of_contacts.remove(contact)
            print("Contact removed.")
            return True
    print("Contact is not saved on this device")
    return False

def edit_contact_feature(contact_feature, new_feature, old_feature):
    for contact in list_of_contacts:
        if contact_feature == 1 and contact['first_name'].lower() == old_feature.lower():
            contact['first_name'] = new_feature.upper()
            print("Contact updated!")
            return
        elif contact_feature == 2 and contact['last_name'].lower() == old_feature.lower():
            contact['last_name'] = new_feature.upper()
            print("Contact updated!")
            return
        elif contact_feature == 3 and old_feature in contact['phone_numbers']:
            contact['phone_numbers'] = [new_feature if number == old_feature else number for number in contact['phone_numbers']]
            print("Contact updated!")
            return
    print("Contact not found.")

def display_options():
    print("""
1. Add Contact
2. Display Contacts
3. Remove Contacts
4. Find Contacts by Phone Number
5. Find Contacts by First name
6. Find Contacts by Last name
7. Edit Contact
0. Exit Program
""")

# Example usage
def main():
    while True:
        display_options()
        choice = int(input("Choose an option: "))
        
        if choice == 1:
            first_name = input("Enter first name: ")
            last_name = input("Enter last name: ")
            phone_numbers = input("Enter phone numbers separated by commas: ").split(",")
            add_contact(first_name, last_name, [num.strip() for num in phone_numbers])
        
        elif choice == 2:
            display_contacts()
        
        elif choice == 3:
            first_name = input("Enter first name to remove: ")
            last_name = input("Enter last name to remove: ")
            remove_contact(first_name, last_name)
        
        elif choice == 4:
            phone_number = input("Enter phone number to find: ")
            contact = find_contact_by_phone_number(phone_number)
            if contact:
                print("Contact found:")
                print(f"First Name: {contact['first_name']}")
                print(f"Last Name: {contact['last_name']}")
                print("Phone Numbers: ", ", ".join(contact['phone_numbers']))
            else:
                print("Contact not found.")
        
        elif choice == 5:
            first_name = input("Enter first name to find: ")
            contact = find_contact_by_first_name(first_name)
            if contact:
                print("Contact found:")
                print(f"First Name: {contact['first_name']}")
                print(f"Last Name: {contact['last_name']}")
                print("Phone Numbers: ", ", ".join(contact['phone_numbers']))
            else:
                print("Contact not found.")
        
        elif choice == 6:
            last_name = input("Enter last name to find: ")
            contact = find_contact_by_last_name(last_name)
            if contact:
                print("Contact found:")
                print(f"First Name: {contact['first_name']}")
                print(f"Last Name: {contact['last_name']}")
                print("Phone Numbers: ", ", ".join(contact['phone_numbers']))
            else:
                print("Contact not found.")
        
        elif choice == 7:
            contact_feature = int(input("What do you want to edit? (1 for First Name, 2 for Last Name, 3 for Phone Number): "))
            new_feature = input("Enter new value: ")
            old_feature = input("Enter old value: ")
            edit_contact_feature(contact_feature, new_feature, old_feature)
        
        elif choice == 0:
            print("Exiting program.")
            break
        
        else:
            print("Invalid choice, please try again.")

if __name__ == "__main__":
    main()