package shapes;

public class Square extends Quadrilateral {
    Square(double side){
        setLength(side);
    }
    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return (4 * length);
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}
