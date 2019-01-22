package ContactsManager;
import util.Input;

public class ContactManager {
    static Input input = new Input();
    public static void main(String[] args) {
        boolean appRunning = true;
        while(appRunning) {
            int userInput = input.getInt(ContactsDisplay.displayOptions(), 1, 5);
            System.out.println();
            switch (userInput){
                case 1:
                    ContactsDisplay.displayContacts();
                    break;
                case 2:
                    ContactsDisplay.displayAdd();
                    break;
                case 3:
                    ContactsDisplay.displaySearch();
                    break;
                case 4:
                    break;
                case 5:
                    appRunning = false;
                    break;
            }
                System.out.println();
        }
    }
}
