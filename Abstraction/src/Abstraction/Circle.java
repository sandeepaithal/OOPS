package abstraction;

/**
 * Represents a Circle, which is a type of Shape.
 * Overrides the draw method to provide specific behavior for drawing a circle.
 * 
 * @param brand The brand of the TV.
 * 
 * @param brand The brand of the TV.
 * @author C Sandeep Aithal
 */
class Circle extends Shape {

    /**
     * Draws the circle and prints a message indicating that a circle is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

/**
 * Represents a Rectangle, which is a type of Shape.
 * Overrides the draw method to provide specific behavior for drawing a rectangle.
 * @author C Sandeep Aithal
 */
class Rectangle extends Shape {

    /**
     *Prints a message indicating that a rectangle is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
