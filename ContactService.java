// Luis Valdez
// CS 230 Software Test Automation – Project One
// 12-3-2023

// ContactService.java

import java.util.HashMap;
import java.util.Map;

// This class manages in-memory storage.

public class ContactService {

    // A HashMap to store IDs as keys.

    private final Map<String, Contact> contacts = new HashMap<>();

    // Adds a new Contact to the storage.

    public void addContact(Contact contact) {

    // Check if the contact is null or if the ID is already in the system.

        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact cannot be null and the ID must be unique.");
        }

        // If the info is valid, this line of code will add it to the HashMap.

        contacts.put(contact.getContactId(), contact);
    }

    // Finds a Contact by their ID.
  
  public Contact getContact(String contactId) {

    // null if not found, but will return the Contact with the ID

        return contacts.get(contactId);
    }

    // Deletes a Contact from the storage by ID.

    public void deleteContact(String contactId) {
    
// Throw an exception If the Contact doesn't exist.

        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact with the provided ID does not exist.");
        }

        // If the Contact exists, remove it from the HashMap.

        contacts.remove(contactId);
    }

    // Updates the contact details for the contact with the given ID.

    public void updateContact(String contactId, String firstName, String lastName, String address, String phone) {

        // Retrieve the Contact to be updated.

        Contact contactToUpdate = getContact(contactId);

        // Check if the Contact exists before attempting to update.

        if (contactToUpdate != null) {
            // Update the fields that are not null.
            if (firstName != null) {
                contactToUpdate.setFirstName(firstName);
            }
            if (lastName != null) {
                contactToUpdate.setLastName(lastName);
            }
            if (address != null) {
                contactToUpdate.setAddress(address);
            }
            if (phone != null) {
                contactToUpdate.setPhone(phone);
            }
        } else {

            // If the Contact doesn't exist, throw an exception.

            throw new IllegalArgumentException("Cannot update, no contact found with ID: " + contactId);
        }
    }
}


