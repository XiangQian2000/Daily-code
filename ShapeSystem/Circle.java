package Daily_code.day1.ShapeSystem;

public class Circle extends Shape {
    public double r;

    public Circle(String shape, double r) {
        super(shape);
        this.r = r;
    }

    double area(){
    return (Math.PI) * r * r;
    }

    double perimeter(){
    return (Math.PI) * r * 2;
    }
}
