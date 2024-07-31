package abstraction;

/**
 * A test class to demonstrate the use of the Appliance and TV classes with abstraction.
 * 
 * This class creates an instance of a TV and turns it on using the abstract Appliance reference.
 * 
 * @author C Sandeep Aithal
 */
public class ApplianceTest {
    public static void main(String[] args) {
        // Create a TV object with the specified brand and assign it to an Appliance reference
        Appliance a1 = new TV("Panasonic");
        
        // Turn on the appliance
        a1.turnon();
    }
}
