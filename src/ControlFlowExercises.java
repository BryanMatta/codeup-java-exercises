import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 5; i<=15; i++){
            if(i<15){
                System.out.print(i + ", ");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println();
        for (long x = 2; x<=1000000; x*=x){
            System.out.println(x);
        }
        System.out.println();
        fizzBuzz();
        System.out.println();
        System.out.println("What number would you like to go up to?");
        int j = keyboard.nextInt();
        keyboard.nextLine();
        tableOfPowers(j);
        System.out.println();
        boolean conf = true;
        while(conf) {
            System.out.println("Please enter grade");
            int grade = keyboard.nextInt();
            keyboard.nextLine();
            gradeConverter(grade);
            System.out.println("Are you comfortable with this grade Y/N? ");
            char confirm = keyboard.next().charAt(0);
            switch (confirm){
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
        }

    }
    private static void fizzBuzz(){
        for (int x = 1; x<=100; x++){
            if (x % 3 == 0 && x % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (x%3==0){
                System.out.println("Fizz");
            }
            else if (x%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(x);
            }
        }
    }

    private static void tableOfPowers(int j) {
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int x = 1; x <= j; x++){
            System.out.format("%-7d| ", x);
            System.out.format("%-8d| ", (x*x));
            System.out.format("%-7d\n", (x*x*x));
        }
        System.out.println();
    }

    private static void gradeConverter(int grade) {
        char letterGrade;
        if (grade>88){
            letterGrade = 'A';
        }
        else if (grade>=80){
            letterGrade = 'B';
        }
        else if (grade>=67){
            letterGrade = 'C';
        }
        else if (grade>=60){
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }
        System.out.println("Grade is: " + letterGrade);
    }
}
