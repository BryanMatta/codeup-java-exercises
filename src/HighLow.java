import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guesses = 0;
        boolean win = false;
        int guess;
        int number;
        boolean play = true;
        while(play) {
            number = getNumber();
            System.out.println("Number has been chosen!");
            System.out.println("Please choose amount of guesses you'd like to try");
            int limit = keyboard.nextInt();
            keyboard.nextLine();
            for (int i = 1; i <= limit; i++) {
                if(guesses>0){
                    System.out.println("You have guessed " + guesses + " time(s)");
                }
                System.out.println("Please enter your guess");//Prompts you to enter the number you think was chosen
                guess = keyboard.nextInt();
                keyboard.nextLine();
                if(guess < number){
                    System.out.println("HIGHER");
                    guesses++;
                }
                else if (guess > number){
                    System.out.println("LOWER");
                    guesses++;
                }
                else{
                    System.out.println("GOOD GUESS!");
                    guesses++;
                    win = true;
                    break;
                }
            }
            if(win){
                System.out.println("YOU WIN!!!");
                System.out.println("You guessed correctly after " + guesses + " guesses");
            }
            else {
                System.out.println("YOU LOSE.");
                System.out.println("The correct number was:" + number);
            }
            System.out.println("Would you like to play again? Y/N? ");
            char confirm = Character.toLowerCase(keyboard.next().charAt(0));
            switch (confirm){
                case 'y':
                    play = true;
                    break;
                case 'n':
                    play = false;
                    break;
            }
        }
    }

    private static int getNumber(){
        return (int)(Math.random() * (100-1) + 1);
    }
}
