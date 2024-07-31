package abstraction;

/**
 * A test class to demonstrate the use of the Shape, Circle, and Rectangle classes with abstraction.
 * 
 * This class creates instances of Circle and Rectangle and draws them using the abstract Shape reference.
 * @author C Sandeep Aithal
 */
public class ShapeTest {
    public static void main(String[] args) {
        // Create a Circle object and assign it to a Shape reference
        Shape c = new Circle();
        c.draw();

        // Create a Rectangle object and assign it to a Shape reference
        Shape r = new Rectangle();
        r.draw();
    }
}
