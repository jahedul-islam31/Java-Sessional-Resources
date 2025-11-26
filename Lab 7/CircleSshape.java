class Shape {

    static void area(double length, double width) {
        double result = length * width;
        System.out.println("Rectangle Area: " + result);
    }

    static void area(double radius) {
        double result = 3.1416 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

public class CircleShape {
    public static void main(String[] args) {
        System.out.println("Fahim");

        Shape.area(10, 5);
        Shape.area(7);
        
    }
}

