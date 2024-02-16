import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the ContactManager class
class ContactManager {
    // List to store Contact objects
    private List<Contact> contacts;

    // Constructor to initialize the ContactManager
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        // Your code here
        contacts.add(contact);
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        // Your code here
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)){
                iterator.remove();
                System.out.println("Contact " + name + " has been Removed");
                System.out.println("___________________________________________");
                return;
            }
            
        }
        System.out.println("Contact cannot be found");
        System.out.println("___________________________________________");
    }

    // Method to list all Contacts
    public void listContacts() {
        // Your code here
        for(Contact contact : contacts){
        System.out.println("Name: " + contact.getName() + "\n" +
            "Email: " + contact.getEmail() + "\n" +
            "Phone Number: " + contact.getPhoneNumber() + "\n" +
            "___________________________________________");
        }
    }


}