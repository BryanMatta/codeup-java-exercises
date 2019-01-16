public class Person {
    private String name;
    public Person(String first){
        setName(first);
    }
    public String getName(){
        return name;
    }
    public void setName(String change){
        name = change;
    }
    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person john = new Person("John");
        john.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
