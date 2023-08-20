package ContactService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void SuccessfulTest() {
        Contact contact = new Contact("12345678", "Allan", "Lee", "1234567890", "101 Contact St.");
        Assertions.assertEquals("12345678", contact.getContactId());
        Assertions.assertEquals("Allan", contact.getFirstName());
        Assertions.assertEquals("Lee", contact.getLastName());
        Assertions.assertEquals("1234567890", contact.getPhone());
        Assertions.assertEquals("101 Contact St.", contact.getAddress());
    }

    // no setter method for ID && ID variable was declared as final---ID not updatable

    // All tests below will fail to demonstrate the restriction checks

    @Test
    public void FailedTestNullID() {
        new Contact(null, "Allan", "Lee", "12345678", "101 Contact St.");
    }

    @Test
    public void FailedTestLongID() {
        new Contact("123456789000", "Allan", "Lee", "12345678", "101 Contact St.");
    }

    @Test
    public void FailedTestNullFirstName() {
        new Contact("001", null, "Lee", "12345678", "101 Contact St.");
    }

    @Test
    public void FailedTestLongFirstName() {
        new Contact("001", "GuessWhoIAm", "Lee", "12345678", "101 Contact St.");
    }

    @Test
    public void FailedTestNullLastName() {
        new Contact("001", "Allan", null, "12345678", "101 Contact St.");
    }

     @Test
    public void FailedTestLongLastName() {
        new Contact("001", "Allan", "GuessWhoIAm", "12345678", "101 Contact St.");
    }

    @Test
    public void FailedTestNullPhoneNumber() {
        new Contact("001", "Allan", "Lee", null, "101 Contact St.");
    }

    @Test
    public void FailedTestInvalidPhoneNumber() {
        new Contact("001", "Allan", "Lee", "12345", "101 Contact St.");
    }

    @Test
    public void FailedTestNullAddress() {
        new Contact("001", "Allan", "Lee", "1234567890", null);
    }

    @Test
    public void FailedTestLongAddress() {
        new Contact("001", "Allan", "Lee", "1234567890", "IAmLivingAtASecretSecludedPlaceThatNoOneKnows");
    }
}


