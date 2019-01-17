package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    void Shape(double length, double width){
        this.length = length;
        this.width = width;
    }
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }
    abstract void setLength(double length);
    abstract void setWidth(double width);
}
