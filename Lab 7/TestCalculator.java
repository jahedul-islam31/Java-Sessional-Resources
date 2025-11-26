class Calculator {

    
    static void add(int a, int b) {
        System.out.println("Sum (two ints): " + (a + b));
    }

    
    static void add(float a, float b) {
        System.out.println("Sum (two floats): " + (a + b));
    }

   
    static void add(int a, int b, int c) {
        System.out.println("Sum (three ints): " + (a + b + c));
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("Fahim");

        Calculator.add(10, 20);        
        Calculator.add(5.5f, 2.5f);    
        Calculator.add(1, 2, 3);       
    }
}
