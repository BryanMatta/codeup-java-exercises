import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Talk with Bob!");
        String userStatement;
        boolean convo = true;
        while(convo){
            System.out.println("What do you want to say?");
            userStatement = keyboard.nextLine();
            char userDemeanor = userStatement.charAt(userStatement.length()-1);
            switch (userDemeanor){
                case '!':
                    yell();
                    break;
                case '?':
                    question();
                    break;
                case '.':
                    defalt();
                    break;
                case ' ':
                    empty();
                    break;
            }
            System.out.println("Are you done talking with him?");
            char confirm = keyboard.nextLine().charAt(0);
            switch (confirm){
                case 'y':
                    convo = false;
                    break;
                case 'Y':
                    convo = false;
                    break;
                case 'N':
                    convo = true;
                    break;
                case 'n':
                    convo = true;
                    break;
                default:
                    convo = true;
                    break;
            }
        }
    }
    private static void question(){
        System.out.println("Sure");
    }
    private static void yell(){
        System.out.println("Whoa, chill out!");
    }
    private static void defalt(){
        System.out.println("Whatever");
    }
    private static void empty(){
        System.out.println("Fine. Be that way!");
    }
}