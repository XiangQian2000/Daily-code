package Daily_code.day1.ShapeSystem;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(String shape, double length, double width) {
        super(shape);
        this.length = length;
        this.width = width;
    }

    double area(){
    return length * width;
    }

    double perimeter(){
    return 2 * (length+width);
    }
}
