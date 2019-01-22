package ContactsManager;


import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static ContactsManager.ContactEditor.filepath;

class ContactsDisplay {
    static List<String> contacts;
    static {
        try {
            contacts = Files.readAllLines(ContactEditor.filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String displayOptions(){
                return "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):";
    }
    static void displayContacts() {
        System.out.println("Name | Phone number");
        System.out.println("-------------------");
        for(int i = 0; i<contacts.size(); i+=2){
            System.out.println(contacts.get(i) + " | " +  contacts.get(i+1));
        }
    }
    static void displayAdd(){
        String nameInput = ContactManager.input.getString("Please enter contact name:");
        String numberInput = ContactManager.input.getString("Please enter contact number:");
        ContactEditor.addContact(nameInput, numberInput);
    }

    static void displaySearch(){
        int userChoice = ContactManager.input.getInt("Would you like to search by:\n" + "1. Name\n" + "2. Number", 1, 2);
        boolean contactExists = false;
        switch (userChoice){
            case 1:
                String userName = ContactManager.input.getString("Please enter name:");
                for (String line: contacts){
                    if(line.contains(userName)){
                        System.out.println(contacts.get(contacts.indexOf(line)) + " | " + contacts.get(contacts.indexOf(line)+1));
                        contactExists = true;
                    }
                }
                if(!contactExists){
                    System.out.println("Contact does not exist.");
                }

            case 2:
        }
    }
}
