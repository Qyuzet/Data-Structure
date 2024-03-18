package W4;
import java.util.LinkedList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class Assignment {


    public static void main(String[] args) {
        LinkedList<Contact> contactBook = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("--------------------------------------\n" +
                    "(A)dd\n" +
                    "(D)elete\n" +
                    "(E)mail Search\n" +
                    "(P)rint list\n"+
                    "(S)earch\n"+
                    "(Q)uit\n"+
                    "--------------------------------------");
            System.out.print("Please Enter a command: ");
            command = (String) scanner.nextLine();

            switch(command) {
                case "A": addContact(contactBook, scanner); break;
                case "D": deleteContact(contactBook, scanner); break;
                case "E": emailSearch(contactBook, scanner); break;
                case "P": printList(contactBook); break;
                case "S": searchContact(contactBook, scanner); break;
                case "Q": break;
                default: System.out.println("Invalid command");
            }
        } while(!command.equals("Q"));

        scanner.close();
    }

    static void addContact(LinkedList<Contact> contactBook, Scanner scanner) {
        // Implement addContact
        System.out.println("Add contact");;

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, phone, email);

        contactBook.add(newContact);

        System.out.println("Contact added succesfully");



    }

    static void deleteContact(LinkedList<Contact> contactBook, Scanner scanner) {
        // Implement deleteContact
        System.out.println("Delete Contact");;

        System.out.print("Enter name of the contact to delete: ");
        String nameToDelete = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < contactBook.size(); i++) {
            Contact contact = contactBook.get(i);
            if (contact.name.equalsIgnoreCase(nameToDelete)) {
                contactBook.remove(i);
                System.out.println("Contact deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact with the given name not found.");
        }


    }

    static void emailSearch(LinkedList<Contact> contactBook, Scanner scanner) {
        // Implement emailSearch
        System.out.println("Email Search");;


        System.out.print("Enter email to search: ");
        String emailToSearch = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < contactBook.size(); i++) {
            Contact contact = contactBook.get(i);
            if (contact.email.equalsIgnoreCase(emailToSearch)) {
                System.out.println("Contact found:");
                System.out.println("Name: " + contact.name);
                System.out.println("Phone: " + contact.phone);
                System.out.println("Email: " + contact.email);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact with the given email not found.");
        }
    }

    static void printList(LinkedList<Contact> contactBook) {
        // Implement printList
        System.out.println("Print List");;

        for(Contact x: contactBook){
            System.out.println();
            System.out.println(x.name);
            System.out.println(x.phone);
            System.out.println(x.email);
            System.out.println();
        };
    }

    static void searchContact(LinkedList<Contact> contactBook, Scanner scanner) {
        // Implement searchContact
        System.out.println("Search Contact");;

        System.out.print("Enter name to search: ");
        String nameToSearch = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < contactBook.size(); i++) {
            Contact contact = contactBook.get(i);
            if (contact.name.equalsIgnoreCase(nameToSearch)) {
                System.out.println("Contact found:");
                System.out.println("Name: " + contact.name);
                System.out.println("Phone: " + contact.phone);
                System.out.println("Email: " + contact.email);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }

    }




}