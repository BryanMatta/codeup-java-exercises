import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        Person john = new Person("John");
        Person jenny = new Person("Jenny");
        Person brock = new Person("Brock");
        int[] numbers = {1, 2, 3, 4, 5};
        String[] people = {john.getName(), jenny.getName(), brock.getName()};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(people));
        people = addPerson(people, "Bran");
        System.out.println(Arrays.toString(people));
    }
    static String[] addPerson(String[] array, String name){
        Person addition = new Person(name);
        String[] tempArray = new String[array.length+1];
        for(int i = 0; i < array.length; i++){
            tempArray[i] = array[i];
        }
        tempArray[array.length] = addition.getName();

        return tempArray;

    }
}
