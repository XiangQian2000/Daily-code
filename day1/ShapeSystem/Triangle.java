package Daily_code.day1.ShapeSystem;

public class Triangle extends Shape{
    public double base;
    public double a;
    public double b;
    public double c;
    public double height;

    public Triangle(String shape, double base, double a, double b, double c, double height) {
        super(shape);
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    double area(){
    return 0.5 * base * height;
    }

    double perimeter(){
    return a+b+c;
    }
}
