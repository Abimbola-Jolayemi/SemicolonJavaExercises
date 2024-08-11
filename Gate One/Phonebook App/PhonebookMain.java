import java.util.Scanner;
import java.util.ArrayList;

public class PhonebookMain{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);
	PhonebookFunction phonebook = new PhonebookFunction();
	ArrayList<String> listOfNumbers;

	while(true){
		System.out.println("Choose from the option below!!!");
		phonebook.displayOptions();
		System.out.println();
		int response = input.nextInt();
		switch(response){
		case 1:
			input.nextLine();

			System.out.print("Enter First name: ");
			String firstName = input.nextLine().toUpperCase();
			System.out.print("Enter Last Name: ");
			String lastName = input.nextLine().toUpperCase();

			listOfNumbers = new ArrayList<>();
			
			String addMoreNumbers = "yes";
			while(addMoreNumbers.equals("yes")){
				System.out.print("Enter phone number: ");
				String phoneNumber = input.nextLine();
				listOfNumbers.add(phoneNumber);

				System.out.print("Do you want to add more phone numbers to this contact?: ");
				addMoreNumbers = input.nextLine().toLowerCase();
			}

			phonebook.addContact(firstName, lastName, listOfNumbers);
			System.out.println();
			System.out.println("********************************************");
		   break;

		case 2:
			phonebook.displayContacts();
			System.out.println();
			System.out.println("********************************************");
		   break;

		case 3:
			input.nextLine();

    			System.out.print("Enter first name of the contact you want to delete: ");
    			String firstNameToRemove = input.nextLine().trim().toUpperCase();
    			System.out.println("Confirm First Name = " + firstNameToRemove);
    
    			System.out.print("Enter Last Name: ");
    			String lastNameToRemove = input.nextLine().trim().toUpperCase();
    			System.out.println("Confirm Last Name = " + lastNameToRemove);
    
    			boolean isRemoved = phonebook.removeContact(firstNameToRemove, lastNameToRemove);
    			if (isRemoved) {
        			System.out.println("Contact removed successfully!");
    			} else {
        			System.out.println("Contact is not saved on this device.");
    			}

			System.out.println();
			System.out.println("********************************************");
    			break;

		case 4:
    			input.nextLine();
    			System.out.print("Search by phone number: ");
    			String phoneNumberToSearch = input.nextLine().trim();

    			String[] contact = phonebook.findContactByPhoneNumber(phoneNumberToSearch);
    			if (contact != null) {
        			System.out.println("Contact found:");
        			System.out.println("First Name: " + contact[0]);
        			System.out.println("Last Name: " + contact[1]);
        			System.out.print("Phone Numbers: ");
        			for (int index = 2; index < contact.length; index++) {
            				System.out.print(contact[index]);
            				if (index < contact.length - 1) {
                				System.out.print(", ");
            				}
        			}
        				System.out.println();
    				} else {
        				System.out.println("No contact found with the phone number: " + phoneNumberToSearch);
    				}
    
    				System.out.println();
    				System.out.println("********************************************");
    				break;
		default:
			System.out.print("Invalid input!!!");
	}
   }
	}
}