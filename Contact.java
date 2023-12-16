// Luis Valdez
// CS 230 Software Test Automation – Project One
// 12-3-2023

// creates a class that contains an address book

// Contact.java

public class Contact {
    
    // Unique identifier for the contact. Immutable once set.

    private final String contactId; 

    // First name does not exceed 10 characters.

    private String firstName;       

    // Last name does not exceed 10 characters.

    private String lastName;        

    // Address does not exceed 30 characters.

    private String address;         

    //The phone number is 10 digits.

    private String phone;           

    // Constructor for creating a new Contact object 

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {

        // Validates the contactId against null and length requirements.

        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid ID, Try Again.");
        }
        this.contactId = contactId;

        // Setter methods for more validation.

        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Getters for private fields of the contact

    public String getContactId() { return contactId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    // Setters for each field

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name: must be 10 characters or less and not null.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name: must be 10 characters or less and not null.");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {

        // Is exactly 10 digits long and numeric.

        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone: must be exactly 10 digits.");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {

        // Does not exceed 30 characters.

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address: must be 30 characters or less and not null.");
        }
        this.address = address;
    }
}

