package Abstraction;

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("drawing a circle");
		
	}

}
class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
		
	}
	
}