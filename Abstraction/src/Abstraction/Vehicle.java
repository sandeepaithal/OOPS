package Abstraction;

abstract class Vehicle {
	String brand;
    public Vehicle(String brand) {
    	this.brand=brand;
    }
    public abstract void startEngine();
}
class Car extends Vehicle{

	public Car(String brand) {
		super(brand);
	
	}

	@Override
	public void startEngine() {
		System.out.println(brand +" has been started");
		
	}
	
}

