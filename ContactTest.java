package contactservice;

import static org.junit.Assert.*;
import org.junit.Test;

//JUnit 4 tests for the Contact class.
public class ContactTest {

 // Test that a contact is created with valid parameters.
 @Test
 public void testContactConstructorValid() {
     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
     assertEquals("12345", contact.getContactId());
     assertEquals("John", contact.getFirstName());
     assertEquals("Doe", contact.getLastName());
     assertEquals("1234567890", contact.getPhone());
     assertEquals("123 Main St", contact.getAddress());
 }

 // Test that a contact with an ID longer than 10 characters throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testContactIdTooLong() {
     new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
 }

 // Test that a contact with a null ID throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testContactIdNull() {
     new Contact(null, "John", "Doe", "1234567890", "123 Main St");
 }

 // Test that a first name longer than 10 characters throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testFirstNameTooLong() {
     new Contact("12345", "FirstnameTooLong", "Doe", "1234567890", "123 Main St");
 }

 // Test that a null first name throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testFirstNameNull() {
     new Contact("12345", null, "Doe", "1234567890", "123 Main St");
 }

 // Test that a last name longer than 10 characters throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testLastNameTooLong() {
     new Contact("12345", "John", "LastnameTooLong", "1234567890", "123 Main St");
 }

 // Test that a null last name throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testLastNameNull() {
     new Contact("12345", "John", null, "1234567890", "123 Main St");
 }

 // Test that a phone number that is not 10 digits throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testPhoneNotTenDigits() {
     new Contact("12345", "John", "Doe", "12345", "123 Main St");
 }

 // Test that a null phone number throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testPhoneNull() {
     new Contact("12345", "John", "Doe", null, "123 Main St");
 }

 // Test that an address longer than 30 characters throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testAddressTooLong() {
     new Contact("12345", "John", "Doe", "1234567890", 
             "This address is way too long to be accepted because it has more than 30 characters");
 }

 // Test that a null address throws an exception.
 @Test(expected = IllegalArgumentException.class)
 public void testAddressNull() {
     new Contact("12345", "John", "Doe", "1234567890", null);
 }

 // Test that setters update the fields correctly.
 @Test
 public void testSettersValid() {
     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
     contact.setFirstName("Mike");
     contact.setLastName("Smith");
     contact.setPhone("0987654321");
     contact.setAddress("456 Park Ave");
     assertEquals("Mike", contact.getFirstName());
     assertEquals("Smith", contact.getLastName());
     assertEquals("0987654321", contact.getPhone());
     assertEquals("456 Park Ave", contact.getAddress());
 }
}