package Multilevelinheritance;

class Animal {
String name;
public void displayname() {
	System.out.println("Name: "+this.name);
}

}
class Mammal extends Animal{
	public void run() {
		System.out.println(name +" is running");
		
	}
}
class Dog extends Mammal{
	public void bark() {
		System.out.println(name +" is barking");
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="xyz";
		d1.displayname();
		d1.run();
		d1.bark();
	}
}

