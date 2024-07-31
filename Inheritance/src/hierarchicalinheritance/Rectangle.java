package hierarchicalinheritance;

/**
 * Represents a rectangle, which is a subclass of Shape.
 * Adds length and breadth, and provides a method to calculate the area.
 * 
 * @author C Sandeep Aithal
 */
public class Rectangle extends Shape {
    int length, breadth;

    /**
     * Calculates and displays the area of the rectangle.
     */
    public void area() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.color = "blue";
        r1.length = 15;
        r1.breadth = 45;
        r1.display();
        r1.area();
    }
}
