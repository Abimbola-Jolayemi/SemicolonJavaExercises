import java.util.ArrayList;

public class PhonebookFunction{
   	
	private ArrayList<String[]> listOfContacts;
	private String firstName;
	private String lastName;
	private ArrayList<String> phoneNumbers;

	public PhonebookFunction() {
        	listOfContacts = new ArrayList<>();
    	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setPhoneNumbers(ArrayList<String> phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}

	public void addContact(String firstName, String lastName, ArrayList<String> phoneNumbers) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();

        	String[] contactInfo = new String[phoneNumbers.size() + 2];
        	contactInfo[0] = this.firstName;
        	contactInfo[1] = this.lastName;

        	for (int index = 0; index < phoneNumbers.size(); index++) {
            		contactInfo[2 + index] = phoneNumbers.get(index);
        	}
        	listOfContacts.add(contactInfo);
    	}

	public void displayContacts() {
		if (listOfContacts.isEmpty()) {
        		System.out.println("No contacts to display.");
        		return;
    		}
    		for (String[] contact : listOfContacts) {
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
			System.out.println();
        	}
    	}

	public String[] findContactByFirstName(String firstName) {
    		for (int index = 0; index < listOfContacts.size(); index++) {
        		String[] contact = listOfContacts.get(index);

        		if (contact[0].equalsIgnoreCase(firstName)) {
            			return contact;
        		}
    		}
    			return null;
	}

	public String[] findContactByLastName(String lastName){
		for (int index = 0; index < listOfContacts.size(); index++) {
        		String[] contact = listOfContacts.get(index);

        		if (contact[1].equalsIgnoreCase(lastName)) {
            			return contact;
        		}
    		}
    			return null;
	}

	public String[] findContactByPhoneNumber(String phoneNumber){
		for (int index = 0; index < listOfContacts.size(); index++) {
        		String[] contact = listOfContacts.get(index);

        		for (int phonenumber = 2; phonenumber < contact.length; phonenumber++) {
            			if (contact[phonenumber].equals(phoneNumber)) {
                			return contact;
            			}
        		}
		}
    			return null;
	}

	public boolean removeContact(String firstName, String lastName) {
		this.firstName = firstName.trim().toUpperCase();
		this.lastName = lastName.trim().toUpperCase();
    		for (int index = 0; index < listOfContacts.size(); index++) {
        		String[] contact = listOfContacts.get(index);

        		if (contact[0].equalsIgnoreCase(firstName) && contact[1].equalsIgnoreCase(lastName)) {
            			listOfContacts.remove(index);
            			return true;
        		}
    		}
			System.out.print("Contact is not saved on this device");
    			return false;
	}

	public void editContactFeature(int contactFeature, String newFeature, String oldFeature) {

		boolean isUpdated = false;

    		for (int index = 0; index < listOfContacts.size(); index++) {
        		String[] contact = listOfContacts.get(index);

        			switch (contactFeature) {
	
            			case 1:
                			if (contact[0].equalsIgnoreCase(oldFeature)) {
                    				contact[0] = newFeature;
                    				isUpdated = true;
                			}
                			break;
            			case 2:
                			if (contact[1].equalsIgnoreCase(oldFeature)) {
                    				contact[1] = newFeature;
                    				isUpdated = true;
                			}
                			break;
            			case 3:
                			for (int phonenumber = 2; phonenumber < contact.length; phonenumber++) {
                    				if (contact[phonenumber].equals(oldFeature)) {
                        				contact[phonenumber] = newFeature;
                        				isUpdated = true;
                        				break;
                    				}
                			}
                			break;
            			default:
                			System.out.println("Invalid Selection.");
                		return;
        			}

        		if (isUpdated) {
            			listOfContacts.set(index, contact);
            			System.out.println("Contact updated!!!.");
            			return;
        		}
    		}

    			System.out.println("Contact not found.");
	}

	public void displayOptions(){
		System.out.print("""
	1. Add Contact
	2. Display Contacts
	3. Remove Contacts
	4. Find Contacts by Phone Number
	5. Find Contacts by First name
	6. Find Contacts by Last name
	7. Edit Contact
	0. Exit Program
""");
	}
}