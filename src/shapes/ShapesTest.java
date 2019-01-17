package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(20);
        System.out.println("Here is the perimeter of your shape: " + myShape.getPerimeter());
        System.out.println("Here is the area of your shape: " + myShape.getArea());
    }
}
//Answers for questions 9. & 10.
//9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//
//
//10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//