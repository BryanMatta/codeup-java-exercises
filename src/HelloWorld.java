public class HelloWorld {
    public static void main(String[] args){
        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);
        String myString = "Bryan Matta";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        System.out.print("Hello,");
        System.out.print(" " + myString + "!\n");
        int z = 4;
        z += 5;
        int a = 3, b = 4;
        b *= a;
        int c = 10,d = 2;
        c /= d;
        d -= c;
        System.out.println(z + " " + a + " " + b + " " + c + " " + d);
    }
}
