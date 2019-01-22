package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

class ContactEditor {
     static Path filepath = Paths.get("data", "contacts.txt");

    static void addContact(String contact, String number) {
        List<String> contactFile = Arrays.asList(contact, number);
        try {
            Files.write(filepath, contactFile, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ContactsDisplay.contacts = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
