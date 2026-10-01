package Question2;
abstract class Shape {
    abstract double area();
}

abstract class Shape2D extends Shape {
    // 2D shapes have only area
}

abstract class Shape3D extends Shape {
    abstract double volume();
}


// Circle
class Circle extends Shape2D {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}


// Rectangle
class Rectangle extends Shape2D {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}


// Sphere
class Sphere extends Shape3D {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}


// Cube
class Cube extends Shape3D {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}


// Main class
public class Program {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Sphere s = new Sphere(5);
        Cube cu = new Cube(4);

        System.out.println("Circle Area = " + c.area());

        System.out.println("Rectangle Area = " + r.area());

        System.out.println("Sphere Surface Area = " + s.area());
        System.out.println("Sphere Volume = " + s.volume());

        System.out.println("Cube Surface Area = " + cu.area());
        System.out.println("Cube Volume = " + cu.volume());
    }
}