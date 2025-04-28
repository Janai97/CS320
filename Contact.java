package contactservice;

public class Contact {
    // Fields
    private final String contactId; // Unique ID, not null, max 10 characters, not updatable
    private String firstName;       // Required, not null, max 10 characters
    private String lastName;        // Required, not null, max 10 characters
    private String phone;           // Required, not null, exactly 10 digits
    private String address;         // Required, not null, max 30 characters

    // Constructor: validates and initializes all fields
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10)
            throw new IllegalArgumentException("Invalid contact ID.");
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Getter for contactId (no setter, not updatable)
    public String getContactId() {
        return contactId;
    }

    // Getter and setter for firstName with validation
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid first name.");
        this.firstName = firstName;
    }

    // Getter and setter for lastName with validation
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid last name.");
        this.lastName = lastName;
    }

    // Getter and setter for phone with validation
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10)
            throw new IllegalArgumentException("Invalid phone number.");
        this.phone = phone;
    }

    // Getter and setter for address with validation
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid address.");
        this.address = address;
    }
}
