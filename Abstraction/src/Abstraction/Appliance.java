package Abstraction;

abstract class Appliance {
String brand;
public Appliance(String brand) {
    this.brand = brand;
}
public abstract void turnon();
}
class TV extends Appliance{

	public TV(String brand) {
		super(brand);
	
	}

	@Override
	public void turnon() {
		System.out.println(brand +" TV has been turned on.");
		
	}
	
}