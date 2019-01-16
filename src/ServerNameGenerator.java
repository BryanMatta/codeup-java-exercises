import java.util.Arrays;

public class ServerNameGenerator {
    static String[] adjectives = {"Happy", "Great", "Angry", "Tiny", "Obedient", "Defiant", "Unkempt", "Glamorous", "Tasty", "Jealous"};
    static String[] nouns = {"Charity", "Adventure", "Cookie", "Snowball", "Snowflake", "Grape", "Talent", "Joy", "Pip", "Chaos"};
    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(nameGenerator(adjectives, nouns));
    }
    static String nameGenerator(String[] array1, String[] array2){
        String name =  namePortion(array1) + "-" + namePortion(array2);
        return name;
    }
    static String namePortion(String[] array){
        int max = array.length-1;
        int min = (array.length-(array.length-1));
        int choice = (int)(Math.random() * (max - min) + min);
        return array[choice];
    }
}
