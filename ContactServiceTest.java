package contactservice;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// JUnit 4 tests for the ContactService class.
public class ContactServiceTest {

    private ContactService service;

    // Setup a new ContactService before each test.
    @Before
    public void setUp() {
        service = new ContactService();
    }

    // Test adding a valid contact.
    @Test
    public void testAddContactValid() {
        Contact contact = new Contact("001", "Alice", "Jones", "1111111111", "1 Elm St");
        service.addContact(contact);
        Contact retrieved = service.getContact("001");
        assertNotNull(retrieved);
        assertEquals("Alice", retrieved.getFirstName());
    }

    // Test that adding a duplicate contact ID throws an exception.
    @Test(expected = IllegalArgumentException.class)
    public void testAddContactDuplicateId() {
        Contact contact1 = new Contact("001", "Alice", "Jones", "1111111111", "1 Elm St");
        Contact contact2 = new Contact("001", "Bob", "Brown", "2222222222", "2 Oak St");
        service.addContact(contact1);
        service.addContact(contact2);  // Should throw exception
    }

    // Test deleting a valid contact.
    @Test
    public void testDeleteContactValid() {
        Contact contact = new Contact("001", "Alice", "Jones", "1111111111", "1 Elm St");
        service.addContact(contact);
        service.deleteContact("001");
        assertNull(service.getContact("001"));
    }

    // Test that deleting a non-existent contact ID throws an exception.
    @Test(expected = IllegalArgumentException.class)
    public void testDeleteContactNotFound() {
        service.deleteContact("999");
    }

    // Test updating a contact's information.
    @Test
    public void testUpdateContactValid() {
        Contact contact = new Contact("001", "Alice", "Jones", "1111111111", "1 Elm St");
        service.addContact(contact);
        service.updateContact("001", "Betty", "Smith", "2222222222", "2 Oak St");
        Contact updated = service.getContact("001");
        assertEquals("Betty", updated.getFirstName());
        assertEquals("Smith", updated.getLastName());
        assertEquals("2222222222", updated.getPhone());
        assertEquals("2 Oak St", updated.getAddress());
    }

    // Test that updating a non-existent contact ID throws an exception.
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateContactNotFound() {
        service.updateContact("999", "Betty", "Smith", "2222222222", "2 Oak St");
    }
}