import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of PI is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Number: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You entered: " + userNumber);
        System.out.print("Please enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        scanner.nextLine();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.print("Please enter a full sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);
    }

}
