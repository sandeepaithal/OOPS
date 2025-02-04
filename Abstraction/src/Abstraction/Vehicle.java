package abstraction;

/**
 * Represents an abstract Vehicle.
 * Provides an abstract method to start the engine.
 * 
 * @author C Sandeep Aithal
 */
abstract class Vehicle {
    String brand;

    /**
     * Constructs a Vehicle object with the specified brand.
     */
    public Vehicle(String brand) {
        this.brand = brand;
    }

    /**
     * Abstract method to start the engine of the vehicle.
     */
    public abstract void startEngine();
}

/**
 * Represents a Car, which is a type of Vehicle.
 * Overrides the startEngine method to provide specific behavior for starting a car's engine.
 * 
 * Author: C Sandeep Aithal
 */
class Car extends Vehicle {

    /**
     * Constructs a Car object with the specified brand.
     */
    public Car(String brand) {
        super(brand);
    }

    /**
     * Starts the engine of the car and prints a message indicating that the car has been started.
     */
    @Override
    public void startEngine() {
        System.out.println(brand + " has been started");
    }
}
