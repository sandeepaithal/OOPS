package hierarchicalinheritance;

public class triangle extends Shape {
int base,height;
public void area() {
	System.out.println("Area :"+(0.5*base*height));
}
public static void main(String[] args) {
	triangle t1=new triangle();
	t1.color="green";
	t1.base=10;
	t1.height=20;
	t1.display();
	t1.area();
}
}
