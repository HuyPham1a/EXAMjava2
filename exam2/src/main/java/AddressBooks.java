import java.util.ArrayList;

public class AddressBooks {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public AddressBooks() {
        contacts.add(new Contact("Trung", "FU", "trung@yahoo.com", "0904818238"));
        contacts.add(new Contact("TuanNM", "Fsoft", "tuan@fpt.com.vn", "0904949494"));
    }

    public void addContact(String name, String company, String email, String phone) {
        Contact contact = new Contact(name, company, email, phone);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void findContactByName(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Phone number for " + name + ": " + contact.getPhone());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Address book:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
