package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle userCircle = new Circle(input.getDouble("Please enter circle radius:"));
        System.out.println("Here is the circumference of your circle: " +
                userCircle.getCircumference() +
                "\n" +
                "Here is the Area of your circle: " +
                userCircle.getArea()
        );
    }
}
