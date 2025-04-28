package contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // In-memory storage for contacts
    private final Map<String, Contact> contacts = new HashMap<>();

    // Adds a new contact if the contact ID is unique
    public void addContact(Contact contact) {
        if (contact == null)
            throw new IllegalArgumentException("Contact cannot be null.");
        if (contacts.containsKey(contact.getContactId()))
            throw new IllegalArgumentException("Contact ID already exists.");
        contacts.put(contact.getContactId(), contact);
    }

    // Deletes a contact by its ID
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId))
            throw new IllegalArgumentException("Contact not found.");
        contacts.remove(contactId);
    }

    // Updates the fields (firstName, lastName, phone, address) of a contact by ID
    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        if (!contacts.containsKey(contactId))
            throw new IllegalArgumentException("Contact not found.");
        Contact contact = contacts.get(contactId);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
    }

    // Helper method to retrieve a contact by its ID (useful for testing)
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}