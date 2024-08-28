abstract class Shape {
    String color;

    // Abstract method (does not have a body)
    abstract double area();

    // Concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape shape = new Circle("Red", 5.5);
        System.out.println("Area: " + shape.area());
        System.out.println("Color: " + shape.getColor());
    }
}
