package Compile.timePolymorphism;

public class Shape {
//method to calculate area of a square
	public double area(int side) {
		return side * side;
	}

//	method to calculate area of rectangle
	public double area(int length, int breadth) {
		return length * breadth;
	}

//	method to calculate area of circle
	public double area(double radius) {
		return 3.14* radius * radius;
	}

	public static void main(String[] args) {
      Shape s1=new Shape();
//      area of square
      double area1=s1.area(5);
      System.out.println("Area of the square: "+area1);
//      area of rectangle
      double area2=s1.area(5, 10);
      System.out.println("Area of rectangle :"+area2);
//      area of circle
      double area3=s1.area(4.5);
      System.out.println("Area of the circle :"+area3);
      
	}
}
