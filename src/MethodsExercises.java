import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(Addition(1,10));
        System.out.println(Substraction(50, 25));
        System.out.println(Division(10, 2));
        System.out.println(Multiplication(25, 8));
        System.out.println(Modulus(15, 2));
        getInteger(1,10);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please choose the amount of sides on your dice!");
        int userPrompt = keyboard.nextInt();
        dice(userPrompt,2);
        factorial(10);
    }
    private static int Addition(int x, int y){
        return x+y;
    }
    private static int Substraction(int x, int y){
        return x-y;
    }
    private static int Division(int x, int y){
        return x/y;
    }
    private static int Multiplication(int x, int y){
        int total = 0;
        for(int i = 1;i<=y;i++){
            total+=x;
        }
        return total;
    }
    private static int Modulus(int x, int y){
        return x%y;
    }
    private static int getInteger(int x, int y){
        Scanner keyboard = new Scanner(System.in);
        boolean conf = true;
        int userInput = 0;
        while(conf) {
            System.out.print("Please enter a number between " + x + " and " + y + ": ");
            userInput = keyboard.nextInt();
            keyboard.nextLine();
            if (userInput < x || userInput > y) {
                System.out.println("Error user entered number outside of range.\nPlease try again.");
                getInteger(x, y);
            } else {
                System.out.println("User entered a valid number.");
            }
            System.out.println("Do you want to see the factorial of selected number?");
            char confirm = keyboard.nextLine().charAt(0);
            switch (confirm) {
                case 'y':
                    conf = false;
                    break;
                case 'Y':
                    conf = false;
                    break;
                case 'N':
                    conf = true;
                    break;
                case 'n':
                    conf = true;
                    break;
                default:
                    conf = true;
                    break;
            }
            factorial(userInput);
        }
        return userInput;
    }
    private static long factorial(int x){
        System.out.print(x+"! = 1");
        long total = 1;
        for(int i = 2; i<=x; i++){
            total*=i;
            System.out.print(" x " + i);

        }
        System.out.println(" = " + total);
        return total;
    }
    private static void dice(int sides, int amount){
        Scanner keyboard = new Scanner(System.in);
        for(int i = 1; i<= amount;i++){
            System.out.println("roll #"+ i + ": " + roll(sides));
        }
        System.out.println("Do you want to roll the dice again?");
        char confirm = keyboard.nextLine().charAt(0);
        switch (confirm) {
            case 'y':
                dice(sides,amount);
                break;
            case 'Y':
                dice(sides,amount);
                break;
            case 'N':
                break;
            case 'n':
                break;
            default:
                break;
        }
    }
    private static double roll(int sides){
        return (int)(Math.random()*(sides - 1) + 1);
    }
}
