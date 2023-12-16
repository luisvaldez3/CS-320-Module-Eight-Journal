// Luis Valdez
// CS 230 Software Test Automation – Project One
// 12-3-2023


// ContactTest.java

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Has the JUnit tests for the Contact class to ensure it meets all defined requirements.

public class ContactTest {

    // Test the creation of a Contact object 

    @Test
    public void testContactCreation() {

        // Attempt to create a contact

        Contact contact = new Contact("1", "Luis", "Valdez", "0123456789", "E 161 St, Bronx, NY 10451");

        // The contact object should not be null

        Assertions.assertNotNull(contact);

        // The first name should match 

        Assertions.assertEquals("Luis", contact.getFirstName());

        // Additional assertions to verify the last name, phone, and address.
    }

    // Additional tests will be added here 
}
