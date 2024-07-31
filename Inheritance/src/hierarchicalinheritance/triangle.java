package hierarchicalinheritance;

/**
 * Represents a triangle, which is a subclass of Shape.
 * Adds base and height, and provides a method to calculate the area.
 * 
 * @author C Sandeep Aithal
 */
public class Triangle extends Shape {
    int base, height;

    /**
     * Calculates and displays the area of the triangle.
     */
    public void area() {
        System.out.println("Area: " + (0.5 * base * height));
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "green";
        t1.base = 10;
        t1.height = 20;
        t1.display();
        t1.area();
    }
}
