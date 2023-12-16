// Luis Valdez
// CS 230 Software Test Automation – Project One
// 12-3-2023

// ContactServiceTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// JUnit tests for the ContactService class.

public class ContactServiceTest {

    // Test to add a new contact to the service.

    @Test
    public void testAddContact() {

        // Create a ContactService to test.

        ContactService service = new ContactService();

        // Create a Contact object

        Contact contact = new Contact("01234", "Luis", "Valdez", "0123456789", "E 161 St, Bronx, NY 10451");

        // Adds the contact 

        service.addContact(contact);

        // The added contact should match and still be able to lookup

        assertEquals(contact, service.getContact("01234"));
    }

// Checks for deletion of contacts, 
// Prevention of duplicate IDs
// Updates contact details
}
