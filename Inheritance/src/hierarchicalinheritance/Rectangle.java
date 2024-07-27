package hierarchicalinheritance;

public class Rectangle extends Shape {
	int length, breadth;

	public void area() {
		System.out.println("Area: " + (length * breadth));
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.color = "blue";
		r1.length = 15;
		r1.breadth = 45;
		r1.display();
		r1.area();
	}
}
