package abstraction;

/**
 * A test class to demonstrate the use of the Vehicle and Car classes with abstraction.
 * 
 * Author: C Sandeep Aithal
 */
public class VehicleTest {
    public static void main(String[] args) {
        // Create a Car object and assign it to a Vehicle reference
        Vehicle v1 = new Car("BMW");
        
        // Start the engine of the vehicle
        v1.startEngine();
    }
}
