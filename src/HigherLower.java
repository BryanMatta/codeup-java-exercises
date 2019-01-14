import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guesses = 0;
        int correctGuesses = 0;
        int currentNumber;
        int nextNumber = getNumber();
        char guess;
        boolean play = true;
        while(play) {
            System.out.println("Please choose amount of guesses you'd like to play");
            int limit = keyboard.nextInt();
            keyboard.nextLine();
            for (int i = 1; i <= limit; i++) {
                currentNumber = nextNumber;
                System.out.println("Your total amount of guesses is: " + guesses +
                        "\nYour total amount of correct guesses is: " + correctGuesses);
                System.out.println("Current number is: " + currentNumber);
                nextNumber = getNumber();
                System.out.println("Please enter your guess (Higher/Lower):");
                guess = Character.toLowerCase(keyboard.next().charAt(0));
                keyboard.nextLine();
                switch (guess) {
                    case 'h':
                        if (currentNumber < nextNumber) {
                            guesses++;
                            correctGuesses++;
                            break;
                        } else {
                            guesses++;
                            break;
                        }
                    case 'l':
                        if (currentNumber > nextNumber) {
                            guesses++;
                            correctGuesses++;
                            break;
                        } else {
                            guesses++;
                            break;
                        }
                }
            }
            System.out.println("Game Over. \nYou guessed " + guesses + " times. \nYou were correct " + correctGuesses + "  times.");

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
