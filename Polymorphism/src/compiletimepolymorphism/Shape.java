package compiletimepolymorphism;

/**
 * A shape class demonstrating compile-time polymorphism through method overloading.
 * Provides methods to calculate the area of different shapes: square, rectangle, and circle.
 * 
 * @author C Sandeep Aithal
 */
public class Shape {
    
    /**
     * Calculates the area of a square.
    public double area(int side) {
        return side * side;
    }

    /**
     * Calculates the area of a rectangle.
     */
    public double area(int length, int breadth) {
        return length * breadth;
    }

    /**
     * Calculates the area of a circle.
     */
    public double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        
        // Area of a square
        double area1 = s1.area(5);
        System.out.println("Area of the square: " + area1);
        
        // Area of a rectangle
        double area2 = s1.area(5, 10);
        System.out.println("Area of the rectangle: " + area2);
        
        // Area of a circle
        double area3 = s1.area(4.5);
        System.out.println("Area of the circle: " + area3);
    }
}
