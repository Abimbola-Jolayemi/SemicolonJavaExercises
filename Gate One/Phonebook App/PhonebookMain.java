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
			System.out.println("********************************************");
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
				System.out.println("********************************************");
        			System.out.println("Contact Information:");
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

		case 5:
			input.nextLine();
			System.out.print("Search Contact by first name: ");
			String firstNameToSearch = input.nextLine().trim();

			String[] firstnameContact = phonebook.findContactByFirstName(firstNameToSearch);
			if(firstnameContact != null){
				System.out.println("********************************************");
				System.out.println("Contact Information:");
        			System.out.println("First Name: " + firstnameContact[0]);
        			System.out.println("Last Name: " + firstnameContact[1]);
        			System.out.print("Phone Numbers: ");
				for (int index = 2; index < firstnameContact.length; index++) {
            				System.out.print(firstnameContact[index]);
            				if (index < firstnameContact.length - 1) {
                				System.out.print(", ");
            				}
        			}
        				System.out.println();
    				} else {
        				System.out.println("No contact found with the phone number: " + firstNameToSearch);
    				}
    
    				System.out.println();
    				System.out.println("********************************************");
    		break;

		case 6:
			input.nextLine();
			System.out.print("Search Contact by last name: ");
			String lastNameToSearch = input.nextLine().trim();

			String[] lastnameContact = phonebook.findContactByLastName(lastNameToSearch);
			if(lastnameContact != null){
				System.out.println("********************************************");
				System.out.println("Contact Information:");
        			System.out.println("First Name: " + lastnameContact[0]);
        			System.out.println("Last Name: " + lastnameContact[1]);
        			System.out.print("Phone Numbers: ");
				for (int index = 2; index < lastnameContact.length; index++) {
            				System.out.print(lastnameContact[index]);
            				if (index < lastnameContact.length - 1) {
                				System.out.print(", ");
            				}
        			}
        				System.out.println();
    				} else {
        				System.out.println("No contact found with the phone number: " + lastNameToSearch);
    				}
    
    				System.out.println();
    				System.out.println("********************************************");
    		break;

		case 7:
			System.out.println("********************************************");
			System.out.println("Choose from the option below: ");
			System.out.print("""
	1. Edit First name
	2. Edit last name
	3. Edit Phone number
""");

			int editSelection = input.nextInt();
                    	input.nextLine();

                    	System.out.print("Enter the old feature: ");
                    	String oldFeature = input.nextLine();

                    	System.out.print("Enter the new feature: ");
                    	String newFeature = input.nextLine();

                    	phonebook.editContactFeature(editSelection, newFeature, oldFeature);
                    	break;

		case 0:
                    System.out.println("......Program exited");
                    input.close();
                    return;
			
		default:
			System.out.print("Invalid input!!!");
		}
       }
    }
}