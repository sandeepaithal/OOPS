package encapsulation;

/**
 * A test class to demonstrate the use of the Car class with encapsulation.
 * 
 * @author C Sandeep Aithal
 */
public class CarTest {
    public static void main(String[] args) {
        // Create a Car object with specified company, model, and year
        Car c1 = new Car("Toyota", "Hyryder", 2022);
        
        // Display the car details using getter methods
        System.out.println("Car Make: " + c1.getCompany());
        System.out.println("Car Model: " + c1.getModel());
        System.out.println("Car Year: " + c1.getYear());
    }
}
