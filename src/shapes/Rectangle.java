package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }

    @Override
    public double getArea() {
        return (length*width);
    }
}
