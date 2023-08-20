package ContactService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    // declaring new object each time
    @BeforeEach
    public void setup() {
        contactService = new ContactService();
    }

    // Test for add, delete, and update
    @Test
    public void testAddContact() {
        Contact contact = new Contact("12345678", "Allan", "Lee", "1234567890", "101 Contact St.");
        contactService.addContact(contact);
        Contact retrievedContact = contactService.getContact("12345678");
        Assertions.assertEquals(contact, retrievedContact);
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("12345678", "Allan", "Lee", "1234567890", "101 Contact St.");
        contactService.addContact(contact);
        contactService.deleteContact("12345678");
        Contact retrievedContact = contactService.getContact("12345678");
        Assertions.assertNull(retrievedContact);
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("12345678", "Allan", "Lee", "1234567890", "101 Contact St.");
        contactService.addContact(contact);
        contactService.updateContact("12345678", "Contact", "Service", "0000000000", "100 Service St.");
        Contact updatedContact = contactService.getContact("12345678");
        Assertions.assertEquals("Contact", updatedContact.getFirstName());
        Assertions.assertEquals("Service", updatedContact.getLastName());
        Assertions.assertEquals("0000000000", updatedContact.getPhone());
        Assertions.assertEquals("100 Service St.", updatedContact.getAddress());
    }
}
