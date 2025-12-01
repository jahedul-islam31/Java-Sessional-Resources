class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class ShapeDraw {
    public static void main(String[] args) {

        Shape s = new Shape();
        Shape c = new Circle();
        Shape r = new Rectangle();

        s.draw();  
        c.draw();  
        r.draw(); 
    }
}
