package singleinheritance;

/**
 * Represents a car with a name, brand, and price. Provides a method to display
 * these details.
 * 
 * @author C Sandeep Aithal
 */
class Cars {
	String name;
	String brand;
	float price;

	/**
	 * Displays the details of the car.
	 */
	public void displayDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Brand: " + this.brand);
		System.out.println("Price: " + this.price);
	}
}

/**
 * Represents a specific car, which is a subclass of Cars. Demonstrates single
 * inheritance.
 * 
 * @author C Sandeep Aithal
 */
class Car extends Cars {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "XUV400";
		c1.brand = "Mahindra";
		c1.price = 2050000;
		c1.displayDetails();
	}
}
