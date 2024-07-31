package multilevelinheritance;

/**
 * Represents a vehicle with a brand.
 * Provides a method to display the brand.
 * 
 * @author C Sandeep Aithal
 */
public class Vehicle {
    String brand;

    /**
     * Displays the brand of the vehicle.
     */
    public void display() {
        System.out.println("Brand: " + brand);
    }
}

/**
 * Represents a car, which is a subclass of Vehicle.
 * Adds a model and overrides the display method to include the model.
 * 
 * @author C Sandeep Aithal
 */
class Car extends Vehicle {
    String model;

    /**
     * Displays the brand and model of the car.
     */
    public void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

/**
 * Represents an electric vehicle (EV), which is a subclass of Car.
 * Adds a battery life and overrides the display method to include the battery life.
 * 
 * @author C Sandeep Aithal
 */
class EV extends Car {
    int batterylife;

    /**
     * Displays the brand, model, and battery life of the EV.
     */
    public void display() {
        super.display();
        System.out.println("Battery life: " + batterylife + " hours");
    }

    public static void main(String[] args) {
        EV ev1 = new EV();
        ev1.brand = "Tesla";
        ev1.model = "Model S";
        ev1.batterylife = 24;
        ev1.display();
    }
}
