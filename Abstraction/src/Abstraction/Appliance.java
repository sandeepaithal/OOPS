package abstraction;

/**
 * Represents an abstract class Appliance with a brand.
 * Provides an abstract method to turn on the appliance.
 * 
 * @author C Sandeep Aithal
 */
abstract class Appliance {
    String brand;

    /**
     * Constructs an Appliance object with the specified brand.
     */
    public Appliance(String brand) {
        this.brand = brand;
    }

    /**
     * Abstract method to turn on the appliance.
     */
    public abstract void turnon();
}

/**
 * Represents a TV, which is a type of Appliance.
 * Overrides the turnon method to provide specific behavior for a TV.
 */
class TV extends Appliance {

    /**
     * Constructs a TV object with the specified brand.
     */
    public TV(String brand) {
        super(brand);
    }

    /**
     * Turns on the TV and prints a message indicating that the TV has been turned on.
     */
    @Override
    public void turnon() {
        System.out.println(brand + " TV has been turned on.");
    }
}
