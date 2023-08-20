package ContactService;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // define contacts as Map
    private Map<String, Contact> contacts;

    // constructors
    public ContactService() {
        // setting up contacts as HashMap
        contacts = new HashMap<>();
    }

    // add, delete, and update methods
    public void addContact(Contact contact) {
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact = new Contact(contactId, firstName, lastName, phone, address);
            contacts.put(contactId, contact);
        }
    }

    // public getter
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
