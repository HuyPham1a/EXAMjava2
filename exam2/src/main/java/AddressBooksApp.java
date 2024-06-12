import java.util.Scanner;

public class AddressBooksApp {
    public static void main(String[] args) {
        AddressBooks addressBooks = new AddressBooks();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    addressBooks.addContact(name, company, email, phone);
                    break;
                case 2:
                    System.out.print("Enter name to find: ");
                    String findName = scanner.nextLine();
                    addressBooks.findContactByName(findName);
                    break;
                case 3:
                    addressBooks.displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
