/**
 * Abstraction - hiding implementation details, showing only necessary behavior
 * Topic: Programming Foundation with Java - 21 Jan 2026
 */
abstract class Shape {
    abstract double area();
    void describe() { System.out.println("Shape"); }
}

class Rectangle extends Shape {
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    double area() { return w * h; }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(3, 4);
        Shape s2 = new Circle(5);
        System.out.println("Rectangle area: " + s1.area());
        System.out.println("Circle area: " + s2.area());
    }
}
