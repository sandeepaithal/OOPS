package encapsulation;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("Toyota", "Hyryder", 2022);
		System.out.println("Car Make: " + c1.getCompany());
		System.out.println("Car Model: " + c1.getModel());
		System.out.println("Car Year: " + c1.getYear());
	}
}
