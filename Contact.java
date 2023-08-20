package ContactService;
public class Contact {

    // variable declaration
    private final String contactId; // final = not updatable
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // constructor
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("ID cannot be null or exceed 10 characters");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name cannot be null or exceed 10 characters");
        }
        if (phone == null || phone.length() != 10 ) {
            throw new IllegalArgumentException("Phone number cannot be null or exceed 10 characters");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address cannot be null or exceed 30 characters");
        }
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // setters and getters
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name cannot be null or exceed 10 characters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name cannot be null or exceed 10 characters");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10 ) {
            throw new IllegalArgumentException("Phone number cannot be null or exceed 10 characters");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address cannot be null or exceed 30 characters");
        }
        this.address = address;
    }
}
