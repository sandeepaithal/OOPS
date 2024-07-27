package compiletimepolymorphism;

public class Calculator {
    // Method to add 2 integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add 2 doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        
        // Adding two integers
        int sum1 = c1.add(10, 20);
        System.out.println(sum1);
        
        // Adding three integers
        int sum2 = c1.add(10, 25, 78);
        System.out.println(sum2);
        
        // Adding two doubles
        double sum3 = c1.add(12.75, 7.25);
        System.out.println(sum3);
    }
}
